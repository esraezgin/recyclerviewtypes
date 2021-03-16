package com.example.recyclerviewtype.viewpager.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.viewpager.model.Data
import kotlinx.android.synthetic.main.item_parent_pager_layout.view.*

class PagerParentItemHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    var pagerParentTextView=itemView.pagerParentTextView

    fun bind(data: Data){
        pagerParentTextView.text=data.city
    }
}