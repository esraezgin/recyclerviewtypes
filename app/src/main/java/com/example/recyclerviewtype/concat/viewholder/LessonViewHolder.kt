package com.example.recyclerviewtype.concat.viewholder

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.concat.model.Lesson
import kotlinx.android.synthetic.main.item_lesson_layout.view.*


class LessonViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {

     var lessonTitle=itemview.lessonTextView
     var lessonLayout=itemview.lessonLayout

    fun bind(data: Lesson) {
      lessonTitle.text=data.lesson
        changeBackground()
    }

    private fun changeBackground() {
        var findLesson:String=lessonTitle.getText().toString()
        println(findLesson)

        when(findLesson){

            "Bilgi Güvenliği"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#63E1E8"))
            }
            "Marka Yönetimi"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#E7F764"))
            }
            "Web Programlama"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#EAADE4"))
            }
            "İktisata Giriş"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#3CE1CD"))
            }
            "Sosyal Ağ Analizi"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#7972EB"))
            }
            "İşletme"->{
                lessonLayout.setBackgroundColor(Color.parseColor("#EF8787"))
            }
        }
    }

}