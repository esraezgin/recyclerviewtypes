package com.example.recyclerviewtype.viewpager.screen

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.nested.adapter.NestedParentAdapter
import com.example.recyclerviewtype.utils.MergeDataSource
import com.example.recyclerviewtype.utils.SettingViewPager
import com.example.recyclerviewtype.viewpager.adapter.ViewAdapter
import kotlinx.android.synthetic.main.activity_pager.*

class PagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        pagerRecyclerView.apply {
            layoutManager= LinearLayoutManager(this@PagerActivity, LinearLayoutManager.VERTICAL,false)
            adapter=ViewAdapter(SettingViewPager.getDataList(this@PagerActivity),this@PagerActivity)
        }
    }



}