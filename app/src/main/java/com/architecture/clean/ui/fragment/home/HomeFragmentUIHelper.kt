package com.architecture.clean.ui.fragment.home

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

fun RecyclerView?.initPopularPersonsList(adapter: GroupAdapter<ViewHolder>?, layoutManager: LinearLayoutManager){
    apply {
        this?.layoutManager = layoutManager
        this?.setHasFixedSize(true)
        this?.adapter = adapter
    }
}

fun getVerticalLayoutManager(context: Context):LinearLayoutManager{
    return LinearLayoutManager(context, RecyclerView.VERTICAL, false)
}

fun clearData(popularPersonsGroupAdapter: GroupAdapter<ViewHolder>,popularPersonsList: ArrayList<PopularPersons>){
    popularPersonsList.clear()
    popularPersonsGroupAdapter.clear()
}