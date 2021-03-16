package com.example.recyclerviewtype.concat.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.concat.model.Department
import kotlinx.android.synthetic.main.item_department_layout.view.*



class DepartmentViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
     var title=itemview.departmentNameTextView

    fun bind(data: Department) {
       title.text=data.departmentName
    }

}