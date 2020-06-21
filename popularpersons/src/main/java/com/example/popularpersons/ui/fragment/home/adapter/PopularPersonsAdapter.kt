package com.example.popularpersons.ui.fragment.home.adapter

import android.content.Context
import com.example.popularpersons.R
import com.examples.data.restful.Config
import com.examples.entities.popular_person.local.PopularPersons
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_movie.view.*

class PopularPersonsAdapter(private val mContext: Context, var data: PopularPersons,private var mListener: OnPopularPersonItemClickListener) : Item<ViewHolder>() {

    override fun getLayout(): Int = R.layout.item_movie

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.apply {
            data.apply {
                tvName.text = name
                tvTitle.text = tile
                tvPopularity.text = popularity.toString()
                tvOverview.text = tile
                Picasso.with(mContext).load(Config.BASE_IMAGE_URL.plus(image)).into(ivImage)

                setOnClickListener {
                    mListener.onPopularPersonItemClickListener(data)
                }
            }
        }
    }

    interface OnPopularPersonItemClickListener{
        fun onPopularPersonItemClickListener(data: PopularPersons)
    }
}
