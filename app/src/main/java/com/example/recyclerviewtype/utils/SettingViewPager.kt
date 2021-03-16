package com.example.recyclerviewtype.utils

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.nested.model.CitiesDetailData
import com.example.recyclerviewtype.viewpager.adapter.ViewAdapter
import com.example.recyclerviewtype.viewpager.model.Data
import com.example.recyclerviewtype.viewpager.model.PagerItem

object SettingViewPager {

    fun getDataList(context:Context):ArrayList<Data>{
        val tempList= ArrayList<Data>()
        val cityiesList = context.resources.getStringArray(R.array.city_name)
        for (i in 0..4) {
                tempList.add(Data(ViewAdapter.VIEW_TYPE_TEXT,cityiesList[i]
                ,buildDetailList(cityiesList[i],context)
                ))

                tempList.add(Data(ViewAdapter.VIEW_TYPE_PAGER,cityiesList[i]
                    ,buildDetailList(cityiesList[i],context)
                ))
        }
        return tempList
    }

    private fun buildDetailList(city: String,context: Context):ArrayList<PagerItem>{
        val pagerItemList = ArrayList<PagerItem>()
        when(city){
            "Türkiye" -> {
                var turkeyText =
                    MergeDataSource.createStringArray(context, R.array.turkey_city_name)
                var imagelist= arrayOf(R.drawable.istanbul,R.drawable.ankara,R.drawable.izmir,
                    R.drawable.trabzon,R.drawable.eskisehir)

                mergeItem(pagerItemList,turkeyText,imagelist)


            }
            "Rusya" -> {
                var russiaText =
                    MergeDataSource.createStringArray(context, R.array.russia_city_name)
                var imagelist= arrayOf(R.drawable.kazan,R.drawable.moskova,R.drawable.novasibirsk,
                    R.drawable.yekaterinburg,R.drawable.sochi,R.drawable.stpetersburg)

                mergeItem(pagerItemList,russiaText,imagelist)

            }
            "Almanya" -> {
                var germanText =
                    MergeDataSource.createStringArray(context, R.array.german_city_name)
                var imagelist= arrayOf(R.drawable.berlin,R.drawable.frankfurt,R.drawable.hamburg,
                    R.drawable.koln,R.drawable.leipzig,R.drawable.munih)

                mergeItem(pagerItemList,germanText,imagelist)
            }
            "Japonya" -> {
                var japanText = MergeDataSource.createStringArray(context, R.array.china_city_name)
                var imagelist= arrayOf(R.drawable.tokyo,R.drawable.kyato,R.drawable.sapporo,
                    R.drawable.naggasaki,R.drawable.yokohama,R.drawable.osaka)

                mergeItem(pagerItemList,japanText,imagelist)
            }
            "İtalya" -> {
                var italyText = MergeDataSource.createStringArray(context, R.array.italy_city_name)
                var imagelist= arrayOf(R.drawable.floransa,R.drawable.cenova,R.drawable.milano,
                    R.drawable.roma,R.drawable.venedik,R.drawable.torino)

                mergeItem(pagerItemList,italyText,imagelist)
            }
        }

        return pagerItemList
    }

    private fun mergeItem(arrayList: ArrayList<PagerItem>,text:Array<String>,img:Array<Int>) {
        for(i in 0..4){
            arrayList.add(PagerItem(text[i],img[i]))
        }

    }



}

