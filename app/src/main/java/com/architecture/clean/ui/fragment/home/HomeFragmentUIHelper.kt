package com.architecture.clean.ui.fragment.home

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.clean.ui.fragment.home.adapter.PopularPersonsAdapter

fun RecyclerView?.initPopularPersonsList(adapter: PopularPersonsAdapter?, layoutManager: LinearLayoutManager){
    apply {
        this?.layoutManager = layoutManager
        this?.setHasFixedSize(true)
        this?.adapter = adapter
    }
}

fun getVerticalLayoutManager(context: Context):LinearLayoutManager{
    return LinearLayoutManager(context, RecyclerView.VERTICAL, false)
}