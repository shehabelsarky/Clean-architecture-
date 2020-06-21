package com.example.popularpersons.ui.fragment.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.popularpersons.R
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.example.popularpersons.ui.activity.MainActivity
import com.examples.core.base.fragment.BaseFragment
import com.example.popularpersons.ui.fragment.home.adapter.PopularPersonsAdapter
import com.examples.core.utils.NavigationConstants
import com.gaelmarhic.quadrant.QuadrantConstants
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
@ExperimentalCoroutinesApi
@FlowPreview
@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel>() {

    override var layoutResourceId: Int = R.layout.fragment_home
    override val viewModel by viewModels<HomeViewModel>()

    private val TAG = HomeFragment::class.java.simpleName
    private val popularPersonsList: ArrayList<PopularPersons> = arrayListOf()
    private val popularPersonsGroupAdapter = GroupAdapter<ViewHolder>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as MainActivity).changeBackButtonVisibility(false)

        rvHome?.initPopularPersonsList(
            popularPersonsGroupAdapter,
            getVerticalLayoutManager(requireContext())
        )
        lifecycleScope.launch {
            with(viewModel) {
                PopularPersonsQuery().apply { page = 1 }.also { getPopularPersons(it) }

                popularPersonsChannel.asFlow().collect {
                    setData(it as ArrayList<PopularPersons>)
                }
            }
        }
    }

    private fun setData(data: ArrayList<PopularPersons>) {
        clearData(popularPersonsGroupAdapter, popularPersonsList)
        popularPersonsList.addAll(data)
        popularPersonsList.map {

            popularPersonsGroupAdapter.add(PopularPersonsAdapter(requireContext(), it,object: PopularPersonsAdapter.OnPopularPersonItemClickListener{
                override fun onPopularPersonItemClickListener(data: PopularPersons) {
                    startActivity(Intent().setClassName(requireContext(), QuadrantConstants.DETAILS_ACTIVITY)
                        .putExtra(NavigationConstants.POPULAR_PERSONS_TO_DETAILS_DATA,data))
                }
            }))
        }
    }
}