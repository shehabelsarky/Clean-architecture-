package com.example.popularpersons.ui.fragment.home

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.appizona.yehiahd.fastsave.FastSave
import com.example.popularpersons.ui.fragment.home.adapter.PopularPersonsAdapter
import com.examples.core.utils.NavigationConstants
import com.examples.entities.popular_person.local.PopularPersons
import com.gaelmarhic.quadrant.QuadrantConstants
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

fun setGroupieAdapterData(context: Context,adapter: GroupAdapter<ViewHolder>,data: PopularPersons){
    adapter.add(
        PopularPersonsAdapter(
            context,
            data,
            object : PopularPersonsAdapter.OnPopularPersonItemClickListener {
                override fun onPopularPersonItemClickListener(data: PopularPersons) {
                    context.startActivity(
                        Intent()
                            .setClassName(
                                context,
                                QuadrantConstants.DETAILS_ACTIVITY
                            )
                            .putExtra(
                                NavigationConstants.POPULAR_PERSONS_TO_DETAILS_DATA,
                                data
                            )
                    )
                }
            })
    )
}

fun clearTinyDatabase(){
    FastSave.getInstance().clearSession()
}