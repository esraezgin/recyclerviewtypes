package com.example.recyclerviewtype.concat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.concat.model.Lesson
import com.example.recyclerviewtype.concat.viewholder.LessonViewHolder

class LessonAdapter(lessonLists:ArrayList<Lesson>): RecyclerView.Adapter<LessonViewHolder>() {

    var temp=lessonLists

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val inflateView= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lesson_layout,parent,false)
        return LessonViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(temp.get(position))
    }

    override fun getItemCount(): Int {
        return temp.size
    }
}