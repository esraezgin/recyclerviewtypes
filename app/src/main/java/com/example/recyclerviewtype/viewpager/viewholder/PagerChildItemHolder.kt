package com.example.recyclerviewtype.viewpager.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.viewpager.model.PagerItem
import kotlinx.android.synthetic.main.item_child_pager_layout.view.*

class PagerChildItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var pageChildImageView=itemView.pageChildImageView
    var pageChildTextView=itemView.pageChildTextView

    fun bind(pagerItem: PagerItem) {
        pageChildImageView.setImageResource(pagerItem.itemImg)
        pageChildTextView.text=pagerItem.itemText
    }
}