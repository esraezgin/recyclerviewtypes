package com.example.recyclerviewtype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.recyclerviewtype.concat.screen.ConcatActivity
import com.example.recyclerviewtype.nested.screen.NestedRcycView
import com.example.recyclerviewtype.slider.screen.SliderActivity
import com.example.recyclerviewtype.viewpager.screen.PagerActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        buttonsClickEvents()
    }

    private fun buttonsClickEvents() {
        showNestedRcyButton.setOnClickListener(this)
        showNestedViewPagerButton.setOnClickListener(this)
        showConcatButton.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
     when(v?.id){
         R.id.showNestedRcyButton->{
             val nestedIntent=Intent(this,NestedRcycView::class.java)
             startActivity(nestedIntent)
         }
         R.id.showNestedViewPagerButton->{
             val pagerIntent=Intent(this,PagerActivity::class.java)
             startActivity(pagerIntent)
         }
         R.id.showConcatButton->{
             val concatIntent=Intent(this,ConcatActivity::class.java)
             startActivity(concatIntent)

         }
         R.id.showSliderViewpager2->{
             val sliderIntent=Intent(this,SliderActivity::class.java)
             startActivity(sliderIntent)

         }else->{
             Log.d(HomeActivity::class.java.simpleName,"Button is undefined")
         }
     }
    }
}