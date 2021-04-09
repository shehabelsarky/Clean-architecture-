package com.example.popularpersons.ui.fragment.cities

import androidx.fragment.app.viewModels
import com.example.popularpersons.R
import com.example.popularpersons.ui.fragment.home.HomeViewModel
import com.examples.core.base.fragment.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

/**
 * Created by Shehab Elsarky
 */
@ExperimentalCoroutinesApi
@FlowPreview
@AndroidEntryPoint
class CitiesFragment : BaseFragment<HomeViewModel>() {

    override var layoutResourceId: Int = R.layout.fragment_cities
    override val viewModel by viewModels<HomeViewModel>()
}