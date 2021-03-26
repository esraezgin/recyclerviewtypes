package com.example.recyclerviewtype.slider.screen

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.slider.adapter.SliderAdapter
import com.example.recyclerviewtype.utils.SliderHelper
import kotlinx.android.synthetic.main.activity_slider.*
import kotlinx.android.synthetic.main.item_slider_layout.*

class SliderActivity : AppCompatActivity() {

    val sliderHandle=Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)
        handleViewPager2()
        //handlerSliderProcessButton()
    }
/*
    private fun handlerSliderProcessButton() {
        stopSliderButton.setOnClickListener {
            if(stopSliderButton.text.equals("Stop")){
                sliderHandle.removeCallbacks(sliderRunnable)
                stopSliderButton.text="Play"
            }else{
                sliderHandle.postDelayed(sliderRunnable,2000)
                stopSliderButton.text="Stop"
            }
        }
    }
*/
/*
    override fun onPause() {
        super.onPause()
        sliderHandle.removeCallbacks(sliderRunnable)
    }

    override fun onResume() {
        super.onResume()
        sliderHandle.postDelayed(sliderRunnable,2000)
    }

 */

    private fun handleViewPager2() {
        imageSliderVP2.adapter=SliderAdapter(SliderHelper.getLoadData(), imageSliderVP2)

        imageSliderVP2.clipToPadding=false
        imageSliderVP2.clipChildren=false
        imageSliderVP2.offscreenPageLimit=3
        imageSliderVP2.getChildAt(0).overScrollMode=RecyclerView.OVER_SCROLL_NEVER
        imageSliderVP2.setPageTransformer(SliderHelper.getCompositePageTransform())

        /*
        imageSliderVP2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                sliderHandle.removeCallbacks(sliderRunnable)
                sliderHandle.postDelayed(sliderRunnable,2000)
            }
        })
        */

    }

  //  private val sliderRunnable = Runnable { imageSliderVP2.setCurrentItem(imageSliderVP2.getCurrentItem() + 1) }
}