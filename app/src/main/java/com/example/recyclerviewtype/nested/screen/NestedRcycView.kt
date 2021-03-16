package com.example.recyclerviewtype.nested.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.utils.MergeDataSource
import com.example.recyclerviewtype.nested.adapter.NestedParentAdapter
import kotlinx.android.synthetic.main.activity_nested_layout.*

class NestedRcycView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested_layout)
        initRecyclerView()
    }


    private fun initRecyclerView() {
        parentNestedRecyclerView.apply {
            layoutManager= LinearLayoutManager(this@NestedRcycView, LinearLayoutManager.VERTICAL,false)
            adapter= NestedParentAdapter(MergeDataSource.setParentData(this@NestedRcycView))
        }
    }
}