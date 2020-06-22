package com.example.details.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.details.R
import com.example.details.ui.utils.DETAILS_DATA
import com.examples.core.base.fragment.BaseFragment
import com.examples.core.utils.setTextData
import com.examples.entities.popular_person.local.PopularPersons
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailsFragment : BaseFragment<DetailsViewModel>() {
    override var layoutResourceId: Int = R.layout.fragment_details
    override val viewModel by viewModels<DetailsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val data = it.getSerializable(DETAILS_DATA) as PopularPersons
            data.apply {
                tvName.setTextData(name)
                tvTile.setTextData(tile)
                tvOverview.setTextData(overview)
                tvPopularity.setTextData(popularity.toString())
            }
        }
    }
}