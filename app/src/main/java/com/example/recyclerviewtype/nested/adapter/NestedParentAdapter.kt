package com.example.recyclerviewtype.nested.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.nested.model.CitiesData
import com.example.recyclerviewtype.nested.viewholder.ParentViewHolder

class NestedParentAdapter(val cityList: ArrayList<CitiesData>)
    : RecyclerView.Adapter<ParentViewHolder>() {

    private var tempList=cityList
    private val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
       val inflateView=LayoutInflater.from(parent.context)
           .inflate(R.layout.item_parent_nestedryc,parent,false)
        return ParentViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
         holder.bind(tempList.get(position),viewPool)
    }

    override fun getItemCount(): Int {
        return tempList.size
    }


}