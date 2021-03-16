package com.example.recyclerviewtype.nested.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.nested.model.CitiesDetailData
import com.example.recyclerviewtype.nested.viewholder.ChildViewHolder

class NestedChildAdapter(val cityDetailList:ArrayList<CitiesDetailData>): RecyclerView.Adapter<ChildViewHolder>() {

    var tempList=cityDetailList
    private val viewPool = RecyclerView.RecycledViewPool()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val inflateView= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_child_nestedryc,parent,false)
        return ChildViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind(tempList.get(position))
    }

    override fun getItemCount(): Int {
        return  tempList.size
    }

}