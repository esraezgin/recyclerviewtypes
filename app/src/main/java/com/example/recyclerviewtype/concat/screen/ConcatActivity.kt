package com.example.recyclerviewtype.concat.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.concat.adapter.LessonAdapter
import com.example.recyclerviewtype.concat.adapter.DepartmentAdapter
import com.example.recyclerviewtype.utils.MergeDataSource
import kotlinx.android.synthetic.main.activity_concat.*

class ConcatActivity : AppCompatActivity() {

    lateinit var headerAdapter: LessonAdapter
    lateinit var titleAdapter: DepartmentAdapter
    lateinit var concatAdapter: ConcatAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concat)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        headerAdapter= LessonAdapter(MergeDataSource.getLessons(this))
        titleAdapter= DepartmentAdapter(MergeDataSource.getDeparmentData())
        concatAdapter= ConcatAdapter(titleAdapter,headerAdapter)
        concatRecyclerView.apply {
            layoutManager= GridLayoutManager(this@ConcatActivity,2)
            adapter=concatAdapter
        }
    }
}