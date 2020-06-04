package com.architecture.clean.ui.fragment.home

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.architecture.clean.R
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.ui.fragment.base.BaseFragment
import com.architecture.clean.ui.fragment.home.adapter.PopularPersonsAdapter
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment() {
    override var layoutResourceId: Int = R.layout.fragment_home

    companion object {
        val FRAGMENT_NAME: String = HomeFragment::class.java.name
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var viewModel: HomeViewModel
    private val popularPersonsList: ArrayList<PopularPersons> = arrayListOf()
    private val popularPersonsGroupAdapter = GroupAdapter<ViewHolder>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rvHome?.initPopularPersonsList(
            popularPersonsGroupAdapter,
            getVerticalLayoutManager(requireContext())
        )
        with(viewModel) {
            PopularPersonsRequest().apply { page = 1 }.also { getPopularPersons(it) }

            popularPersonsLiveData.observe(this@HomeFragment, Observer {
                progressBar_home.visibility = View.GONE
                setData(it)
            })
            error.observe(this@HomeFragment, Observer {
                progressBar_home.visibility = View.GONE
                Toast.makeText(context, "${it?.message}", Toast.LENGTH_LONG).show()
            })
        }
    }

    private fun setData(data: ArrayList<PopularPersons>){
        clearData(popularPersonsGroupAdapter,popularPersonsList)
        popularPersonsList.addAll(data)
        popularPersonsList.map {
            popularPersonsGroupAdapter.add(PopularPersonsAdapter(requireContext(), it))
        }
    }
}