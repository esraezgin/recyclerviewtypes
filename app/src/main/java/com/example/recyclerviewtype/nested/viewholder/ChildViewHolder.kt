package com.example.recyclerviewtype.nested.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.nested.model.CitiesDetailData
import kotlinx.android.synthetic.main.item_child_nestedryc.view.*

class ChildViewHolder (itemView:View): RecyclerView.ViewHolder(itemView) {
    var cityNameText=itemView.childCityName
    var cityImage=itemView.childCityImage

    fun bind(data: CitiesDetailData) {
        cityNameText.text=data.cityName
        cityImage.setImageResource(data.cityPicture)
    }
}