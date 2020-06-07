package com.architecture.clean.ui.fragment.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.architecture.clean.ui.utils.LoadingListener
import com.architecture.clean.ui.view_model.BaseViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment : DaggerFragment() {

    internal abstract var layoutResourceId: Int
    private var loader: LoadingListener? = null

    @Inject lateinit var baseViewModel: BaseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResourceId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        with(baseViewModel) {

            errorLiveData.observe(this@BaseFragment, Observer {
                Toast.makeText(context, "${it?.message}", android.widget.Toast.LENGTH_LONG).show()
            })

            cancellationMsgLiveData.observe(this@BaseFragment, Observer {
                Toast.makeText(context, it, android.widget.Toast.LENGTH_LONG).show()
            })

            isLoadingLiveData.observe(this@BaseFragment, Observer {
                showLoading(it)
            })
        }

    }

    private fun showLoading(show: Boolean) {
        loader?.showLoading(show)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        context.let {
            if (context is LoadingListener)
                loader = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        showLoading(false)
        loader = null
    }

    override fun onStop() {
        super.onStop()
        showLoading(false)
    }
}
