package com.architecture.clean.ui.home

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.architecture.clean.R
import com.architecture.clean.core.Config
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.architecture.clean.domain.model.popular_person.parameters.PopularPersonsRequest
import com.architecture.clean.ui.home.adapter.PopularPersonsAdapter
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : DaggerFragment() {
    private val TAG: String = HomeFragment::class.java.simpleName

    companion object {
        val FRAGMENT_NAME: String = HomeFragment::class.java.name
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(HomeViewModel::class.java)
    }
    private val popularPersonsList: ArrayList<PopularPersons> = arrayListOf()
    private val popularPersonsAdapter: PopularPersonsAdapter by lazy {
        PopularPersonsAdapter(
            requireContext(),
            popularPersonsList
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initPopularPersonsList(
            rv_main_home,
            popularPersonsAdapter,
            getVerticalLayoutManager(requireContext())
        )
        with(viewModel) {
            PopularPersonsRequest().apply {
                page = 1
                apiKey = Config.API_KEY
            }.also {
                getPopularPersons(it)
            }

            popularPersonsLiveData.observe(this@HomeFragment, Observer {
                progressBar_home.visibility = View.GONE
                popularPersonsList.addAll(it)
                popularPersonsAdapter.notifyDataSetChanged()
            })
            error.observe(this@HomeFragment, Observer {
                progressBar_home.visibility = View.GONE
                Toast.makeText(context, "${it?.message}", Toast.LENGTH_LONG).show()
            })
        }
    }
}