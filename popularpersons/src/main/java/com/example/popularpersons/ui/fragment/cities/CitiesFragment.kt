package com.example.popularpersons.ui.fragment.cities

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.popularpersons.R
import com.example.popularpersons.ui.fragment.home.HomeViewModel
import com.examples.core.base.fragment.BaseFragment
import com.examples.entities.city.local.City
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_cities.*
import kotlinx.android.synthetic.main.list_layout.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * Created by Shehab Elsarky
 */
@ExperimentalCoroutinesApi
@FlowPreview
@AndroidEntryPoint
class CitiesFragment : BaseFragment<HomeViewModel>() {

    override var layoutResourceId: Int = R.layout.fragment_cities
    override val viewModel by viewModels<HomeViewModel>()
    private lateinit var citiesAdapter: CitiesAdapter
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private var citiesList: ArrayList<City> = arrayListOf()
    private var dropdownCitiesList: ArrayList<City> = arrayListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCitiesList()
        collectCitiesList()
    }

    private fun initCitiesList() {
        citiesAdapter = CitiesAdapter({ cityDetails ->
            navigateToWeatherFragment(cityDetails.cityName)
        }, { city, position ->
            citiesList.removeAt(position)
            citiesAdapter.notifyItemRemoved(position)
        })
        rvList.adapter = citiesAdapter
    }

    private fun collectCitiesList() {
        lifecycleScope.launch {
            with(viewModel) {
                getCities()
                citiesChannel.asFlow().collect {
                    initCitiesAndCitiesDropdownLists(
                        citiesList,
                        dropdownCitiesList,
                        it as ArrayList<City>
                    )
                    citiesAdapter.submitList(citiesList)
                    initCitiesDropDownList(dropdownCitiesList)
                    initLocationService()
                }
            }
        }
    }

    private fun initCitiesDropDownList(citiesList: List<City>) {
        val citiesDropDownAdapter = CitiesArrayAdapter(requireContext(), citiesList)
        (input_layout_type.editText as? AutoCompleteTextView)?.run {
            setAdapter(citiesDropDownAdapter)
            setOnItemClickListener { _, _, position, _ ->
                navigateToWeatherFragment(citiesList[position].cityName)
            }
        }
    }

    private fun navigateToWeatherFragment(cityName: String) = findNavController().navigate(
        CitiesFragmentDirections.actionCitiesFragmentToWeatherFragment(cityName)
    )

    private fun initLocationService() {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        fusedLocationClient.lastLocation
            .addOnSuccessListener { location: Location? ->
                if (location != null) {
                    val city =
                        getCityFromLatLng(requireContext(), location.latitude, location.longitude)
                    if (city.isNotEmpty()) {
                        if (!citiesList.contains(City(city))) {
                            viewModel.addCity(citiesList, city, 0)
                            citiesAdapter.notifyDataSetChanged()
                        }
                    }
                }
            }
    }
}