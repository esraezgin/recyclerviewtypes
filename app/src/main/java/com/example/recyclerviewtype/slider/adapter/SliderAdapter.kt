package com.example.recyclerviewtype.slider.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.slider.model.Picture
import com.example.recyclerviewtype.slider.viewholder.SliderAdapterViewHolder

class SliderAdapter(imageList: ArrayList<Picture>, viewPager2: ViewPager2) : RecyclerView.Adapter<SliderAdapterViewHolder>() {


     val tempImageList=imageList
     val _viewPager2=viewPager2


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderAdapterViewHolder {
        val inflateView= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_slider_layout, parent, false)

        return SliderAdapterViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: SliderAdapterViewHolder, position: Int) {
       holder.bind(tempImageList[position])
        /*
          INFINITE LOOP İSTENMESSE
          if(position==tempImageList.size){
            _viewPager2.post(runnable)
        }
         */
      /* if(position==(tempImageList.size-2)){
            _viewPager2.post(runnable)
            }
        }*/
    }

    override fun getItemCount(): Int {
        return tempImageList.size
    }

    private val runnable = Runnable {
        tempImageList.addAll(tempImageList)
        notifyDataSetChanged()
    }

}