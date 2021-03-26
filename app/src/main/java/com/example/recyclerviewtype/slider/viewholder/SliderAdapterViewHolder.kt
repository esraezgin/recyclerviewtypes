package com.example.recyclerviewtype.slider.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recyclerviewtype.slider.model.Picture
import kotlinx.android.synthetic.main.item_slider_layout.view.*

class SliderAdapterViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val imageView:ImageView=view.slider_itemImageView
   // val imageName:TextView=view.sliderName


    fun bind(item: Picture){
        imageView.setImageResource(item.imageData)
       // imageName.text=item.imageName
    }
}