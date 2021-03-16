package com.example.recyclerviewtype.concat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.concat.model.Department
import com.example.recyclerviewtype.concat.viewholder.DepartmentViewHolder

class DepartmentAdapter(department:Department): RecyclerView.Adapter<DepartmentViewHolder>() {

    var temp=department

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentViewHolder {
        val inflateView= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_department_layout,parent,false)
        return DepartmentViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: DepartmentViewHolder, position: Int) {
        holder.bind(temp)
    }

    override fun getItemCount(): Int {
        return 1
    }
}