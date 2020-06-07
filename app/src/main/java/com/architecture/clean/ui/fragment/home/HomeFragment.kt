package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.View
import com.architecture.clean.R
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.ui.activity.MainActivity
import com.architecture.clean.ui.fragment.base.BaseFragment
import com.architecture.clean.ui.fragment.home.adapter.PopularPersonsAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment() {
    override var layoutResourceId: Int = R.layout.fragment_home

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var homeViewModel: HomeViewModel
    private val popularPersonsList: ArrayList<PopularPersons> = arrayListOf()
    private val popularPersonsGroupAdapter = GroupAdapter<ViewHolder>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).changeBackButtonVisibility(false)

        rvHome?.initPopularPersonsList(
            popularPersonsGroupAdapter,
            getVerticalLayoutManager(requireContext())
        )

        with(homeViewModel) {
            PopularPersonsRequest().apply { page = 1 }.also { getPopularPersons(it) }
            popularPersonsLiveData.observe(this@HomeFragment, Observer (::setData))

            isLoadingLiveData.observe(this@HomeFragment, Observer {
                if (it)
                    progressBar_home.visibility = View.VISIBLE
                else
                    progressBar_home.visibility = View.GONE
            })
        }
    }

    private fun setData(data: ArrayList<PopularPersons>) {
        clearData(popularPersonsGroupAdapter, popularPersonsList)
        popularPersonsList.addAll(data)
        popularPersonsList.map {
            popularPersonsGroupAdapter.add(PopularPersonsAdapter(requireContext(), it))
        }
    }
}