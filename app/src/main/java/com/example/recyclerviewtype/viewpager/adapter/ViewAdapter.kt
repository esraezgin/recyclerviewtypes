package com.example.recyclerviewtype.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.viewpager.model.Data

import com.example.recyclerviewtype.viewpager.viewholder.PagerItemHolder
import com.example.recyclerviewtype.viewpager.viewholder.PagerParentItemHolder
import java.util.HashMap

class ViewAdapter(list:ArrayList<Data>,var context:Context)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {

        internal val VIEW_TYPE_TEXT = 51
        internal val VIEW_TYPE_PAGER = 52
    }

    var tempList=list
    private val mViewPageStates = HashMap<Int, Int>()

   init {
       this.context=context
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        var itemholder:RecyclerView.ViewHolder?=null
        when (viewType) {
            VIEW_TYPE_TEXT -> {
                val parentView=layoutInflater.inflate(R.layout.item_parent_pager_layout,parent,false)
                itemholder= PagerParentItemHolder(parentView)
            }

            VIEW_TYPE_PAGER -> {
                val childView=layoutInflater.inflate(R.layout.item_recycler_pager,parent,false)
                itemholder= PagerItemHolder(childView)
            }
        }
        return itemholder!!

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            VIEW_TYPE_TEXT -> {
                val parentHolder = holder as PagerParentItemHolder
                parentHolder.bind(tempList[position])
            }

            VIEW_TYPE_PAGER -> {
                val childHolder=holder as PagerItemHolder
                configurePagerHolder(childHolder, position)
            }
        }
    }

    private fun configurePagerHolder(holder: PagerItemHolder, position: Int) {

        var pagerAdapter=CustomPageAdapter(tempList[position].pagerItemList,context)
        holder.bind(pagerAdapter)

        if (mViewPageStates.containsKey(position)) {
            holder.viewPager.currentItem = mViewPageStates[position]!!
        }
    }
    override fun onViewRecycled(holder: RecyclerView.ViewHolder) {

        if (holder is PagerItemHolder) {

            mViewPageStates[holder.getAdapterPosition()] = holder.viewPager.currentItem
            super.onViewRecycled(holder)
        }
    }

    override fun getItemViewType(position: Int): Int {

        return tempList[position].viewType
    }

    override fun getItemCount(): Int {
        return tempList.size
    }
}