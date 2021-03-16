package com.example.recyclerviewtype.utils

import android.view.View
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.slider.model.Picture

object SliderHelper {


    fun getLoadData():ArrayList<Picture>{
        val imageList=ArrayList<Picture>()
        loadData(imageList,R.drawable.istanbul,"İstanbul")
            loadData(imageList,R.drawable.ankara,"Ankara")
        loadData(imageList,R.drawable.berlin,"Berlin")
        loadData(imageList,R.drawable.cenova,"Cenova")
        loadData(imageList,R.drawable.eskisehir,"Eskişehir")
        loadData(imageList,R.drawable.koln,"Köln")
        loadData(imageList,R.drawable.leipzig,"Leipzig")
        loadData(imageList,R.drawable.naggasaki,"Nagasaki")
        loadData(imageList,R.drawable.yekaterinburg,"Yekaterinburg")
        loadData(imageList,R.drawable.trabzon,"Trabzon")
        return imageList
    }


    fun getCompositePageTransform():CompositePageTransformer{
        val _compositePageTransform=CompositePageTransformer()
        _compositePageTransform.addTransformer(MarginPageTransformer(40))
        _compositePageTransform.addTransformer(object :ViewPager2.PageTransformer{
            override fun transformPage(page: View, position: Float) {
                var r = 1-Math.abs(position)
                page.setScaleY(0.85f + r * 0.15f);
            }
        })

        return _compositePageTransform
    }



    fun loadData(imageList:ArrayList<Picture>,image:Int,name:String){
        imageList.add(Picture(image,name))
    }
}