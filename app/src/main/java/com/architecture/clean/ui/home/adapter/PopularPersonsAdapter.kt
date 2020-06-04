package com.architecture.clean.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.architecture.clean.R
import com.architecture.clean.core.Config
import com.architecture.clean.domain.model.popular_person.local.PopularPersons
import com.squareup.picasso.Picasso

class PopularPersonsAdapter(private val mContext: Context, var list: ArrayList<PopularPersons>) : androidx.recyclerview.widget.RecyclerView.Adapter<PopularPersonsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.food_item_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
       holder.apply {
           tvName.text = data.name
           tvTitle.text = data.tile
           tvPopularity.text = data.popularity.toString()
           tvOverview.text = data.tile
           Picasso
               .with(mContext)
               .load(
                   Config.BASE_IMAGE_URL.
                       plus(data.image)
               )
               .into(ivImage)
       }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        internal var ivImage: ImageView = itemView.findViewById(R.id.profile_pic)
        internal var tvName: TextView = itemView.findViewById(R.id.name)
        internal var tvTitle: TextView = itemView.findViewById(R.id.time)
        internal var tvPopularity: TextView = itemView.findViewById(R.id.like)
        internal var tvOverview: TextView = itemView.findViewById(R.id.overView)
    }
}
