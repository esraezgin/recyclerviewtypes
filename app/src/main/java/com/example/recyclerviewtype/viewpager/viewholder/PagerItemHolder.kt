package com.example.recyclerviewtype.viewpager.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.viewpager.adapter.CustomPageAdapter
import kotlinx.android.synthetic.main.item_recycler_pager.view.*

class PagerItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var viewPager=itemView.slidesPager
    fun bind(pagerAdapter: CustomPageAdapter) {
        viewPager.adapter=pagerAdapter
    }




}