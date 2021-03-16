package com.example.recyclerviewtype.viewpager.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.viewpager.model.PagerItem
import com.example.recyclerviewtype.viewpager.viewholder.PagerChildItemHolder

class CustomPageAdapter(list: List<PagerItem>?, val context: Context):PagerAdapter() {

    var tempPagerItem=list


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater= LayoutInflater.from(container.context)
        val pagerView = layoutInflater.inflate(R.layout.item_child_pager_layout,container, false)
        val holder = PagerChildItemHolder(pagerView)

        holder.bind(tempPagerItem!!.get(position))

        container.addView(pagerView)
        return pagerView
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {

        return tempPagerItem!!.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}