package com.architecture.clean.ui.home

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.clean.ui.home.adapter.PopularPersonsAdapter

fun initPopularPersonsList(recyclerView: RecyclerView?, adapter: PopularPersonsAdapter?, layoutManager: LinearLayoutManager){
    recyclerView?.apply {
        this.layoutManager = layoutManager
        setHasFixedSize(true)
        this.adapter = adapter
    }
}

fun getVerticalLayoutManager(context: Context):LinearLayoutManager{
    return LinearLayoutManager(context, RecyclerView.VERTICAL, false)
}