package com.example.popularpersons.ui.fragment.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.appizona.yehiahd.fastsave.FastSave
import com.example.popularpersons.R
import com.examples.entities.popular_person.local.PopularPersons
import com.examples.entities.popular_person.parameters.PopularPersonsQuery
import com.example.popularpersons.ui.activity.MainActivity
import com.examples.core.base.fragment.BaseFragment
import com.example.popularpersons.utils.WORK_MANAGER_STATE
import com.examples.core.utils.NetworkingUtils
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
                PopularPersonsQuery().apply { page = 1 }.also {
                    if (NetworkingUtils.isNetworkConnected)
                        getPopularPersons(it)
                    else
                        selectPopularPersons()
                }

                popularPersonsChannel.asFlow().collect {
                    setData(it as ArrayList<PopularPersons>)
                }
            }
        }

        btnTest.setOnClickListener {
            if (!NetworkingUtils.isNetworkConnected) {
                with(viewModel) {
                    PopularPersonsQuery().apply { page = 1 }.also {
                        getPopularPersons(it, requireContext())
                    }
                }
            }
        }

        Log.d(
            TAG,
            "Work Manager state: " + FastSave.getInstance().getString(WORK_MANAGER_STATE, "")
        )
        clearTinyDatabase()
    }

    private fun setData(data: ArrayList<PopularPersons>) {
        clearData(popularPersonsGroupAdapter, popularPersonsList)
        popularPersonsList.addAll(data)
        popularPersonsList.map {
            setGroupieAdapterData(requireContext(), popularPersonsGroupAdapter, it)
        }
    }
}