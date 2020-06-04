package com.architecture.clean.ui.fragment.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.architecture.clean.R
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment() {

    internal abstract var layoutResourceId: Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResourceId, container, false)
    }
}
