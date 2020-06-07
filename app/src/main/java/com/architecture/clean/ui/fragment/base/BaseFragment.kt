package com.architecture.clean.ui.fragment.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.architecture.clean.R
import com.architecture.clean.ui.view_model.BaseViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment : DaggerFragment() {

    internal abstract var layoutResourceId: Int

    @Inject
    lateinit var viewModel: BaseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResourceId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        with(viewModel) {

            errorLiveData.observe(this@BaseFragment, Observer {
                Toast.makeText(context, "${it?.message}", android.widget.Toast.LENGTH_LONG).show()
            })

            cancellationMsgLiveData.observe(this@BaseFragment, Observer {
                Toast.makeText(context, it, android.widget.Toast.LENGTH_LONG).show()
            })
        }

    }
}
