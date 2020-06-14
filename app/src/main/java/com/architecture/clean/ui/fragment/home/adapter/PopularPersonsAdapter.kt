package com.architecture.clean.ui.fragment.home.adapter

import android.content.Context
import com.architecture.clean.R
import com.examples.data.restful.Config
import com.examples.entities.popular_person.local.PopularPersons
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_movie.view.*

class PopularPersonsAdapter(private val mContext: Context, var data: PopularPersons) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_movie

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.apply {
            data.apply {
                tvName.text = name
                tvTitle.text = tile
                tvPopularity.text = popularity.toString()
                tvOverview.text = tile
                Picasso.with(mContext).load(Config.BASE_IMAGE_URL.plus(image)).into(ivImage)
            }

        }
    }
}
