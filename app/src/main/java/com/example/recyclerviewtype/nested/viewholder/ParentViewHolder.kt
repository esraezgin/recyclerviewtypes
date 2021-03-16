package com.example.recyclerviewtype.nested.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.nested.adapter.NestedChildAdapter
import com.example.recyclerviewtype.nested.model.CitiesData
import kotlinx.android.synthetic.main.item_parent_nestedryc.view.*

class ParentViewHolder (itemView:View): RecyclerView.ViewHolder(itemView) {
    var nationalNameText=itemView.parent_nationalName
    var childRecyclerView=itemView.childNestedRecyclerView

    fun bind(citiesData: CitiesData, viewPool: RecyclerView.RecycledViewPool) {
        nationalNameText.text=citiesData.nationalName
        val childLayoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL,
                false)
        childRecyclerView.apply {
            layoutManager = childLayoutManager
            adapter = NestedChildAdapter(citiesData.cityList)
            setRecycledViewPool(viewPool)
        }
    }
}
