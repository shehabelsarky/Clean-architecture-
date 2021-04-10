/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.examples.core.base.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import java.util.concurrent.Executors

/**
 * A generic RecyclerView adapter that uses Data Binding & DiffUtil.
 *
 * @param T Type of the items in the list
 * */
abstract class BaseRecyclerAdapter<T>(
    areItemsTheSame: (T, T) -> Boolean,
    areItemsContentsTheSame: (T, T) -> Boolean = { oldItem, newItem -> oldItem == newItem }
) : ListAdapter<T, BaseViewHolder>(
    AsyncDifferConfig
        .Builder<T>(object : DiffUtil.ItemCallback<T>() {
            override fun areItemsTheSame(oldItem: T, newItem: T) = areItemsTheSame(oldItem, newItem)
            override fun areContentsTheSame(oldItem: T, newItem: T) =
                areItemsContentsTheSame(oldItem, newItem)
        })
        .setBackgroundThreadExecutor(Executors.newFixedThreadPool(3))
        .build()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(itemLayoutRes, parent, false)

        return BaseViewHolder(view)
    }

    /**
     * the layout of the item
     */
    abstract val itemLayoutRes: Int

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        bind(holder.itemView, getItem(position), position)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    /**
     * Bind the item of type [T] to the itemView
     */
    protected abstract fun bind(view: View, item: T, position: Int)

    fun addToList(newList: List<T>) {
        submitList(ArrayList(currentList).apply { addAll(newList) })
    }

    fun clear() {
        submitList(emptyList())
    }

    fun addElementToList(index: Int,element: T){
        currentList.add(index,element)
        notifyItemChanged(index)
    }

    fun removeElement(item: T){
        ArrayList(currentList).remove(item)
        notifyDataSetChanged()
    }
}

class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view)
