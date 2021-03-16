package com.example.recyclerviewtype.utils

import android.content.Context
import com.example.recyclerviewtype.R
import com.example.recyclerviewtype.concat.model.Department
import com.example.recyclerviewtype.concat.model.Lesson
import com.example.recyclerviewtype.nested.model.CitiesData
import com.example.recyclerviewtype.nested.model.CitiesDetailData


object MergeDataSource {


    fun setParentData(context: Context): ArrayList<CitiesData> {
        var parentList = ArrayList<CitiesData>()

        var cityiesList = context.resources.getStringArray(R.array.city_name)

        for (i in 0..4) {
            parentList.add(CitiesData(cityiesList[i], setChildData(context, cityiesList[i])))
            println("National Name ${parentList.get(i).nationalName}")
        }
        return parentList
    }

    fun setChildData( context: Context, nationalName: String): ArrayList<CitiesDetailData> {

        var childList = ArrayList<CitiesDetailData>()

        when(nationalName){
            "Türkiye" -> {

                var turkeyText = createStringArray(context, R.array.turkey_city_name)
                var imagelist= arrayOf(R.drawable.istanbul,R.drawable.ankara,R.drawable.izmir,
                   R.drawable.trabzon,R.drawable.eskisehir)

                fullItem(childList, turkeyText,imagelist)
            }
            "Rusya" -> {
                var russiaText = createStringArray(context, R.array.russia_city_name)
                var imagelist= arrayOf(R.drawable.kazan,R.drawable.moskova,R.drawable.novasibirsk,
                    R.drawable.yekaterinburg,R.drawable.sochi,R.drawable.stpetersburg)

                fullItem(childList, russiaText,imagelist)

            }
            "Almanya" -> {
                var germanText = createStringArray(context, R.array.german_city_name)
                var imagelist= arrayOf(R.drawable.berlin,R.drawable.frankfurt,R.drawable.hamburg,
                    R.drawable.koln,R.drawable.leipzig,R.drawable.munih)

                fullItem(childList, germanText,imagelist)
            }
            "Japonya" -> {
                var chinaText = createStringArray(context, R.array.china_city_name)
                var imagelist= arrayOf(R.drawable.tokyo,R.drawable.kyato,R.drawable.sapporo,
                    R.drawable.naggasaki,R.drawable.yokohama,R.drawable.osaka)

                fullItem(childList, chinaText,imagelist)
            }
            "İtalya" -> {
                var italyText = createStringArray(context, R.array.italy_city_name)
                var imagelist= arrayOf(R.drawable.floransa,R.drawable.cenova,R.drawable.milano,
                    R.drawable.roma,R.drawable.venedik,R.drawable.torino)

                fullItem(childList, italyText,imagelist)
            }
        }

        return childList
    }

    fun addList(
        arrayList: ArrayList<CitiesDetailData>,
        id: Int,
        stringArray: Array<String>,
        integerArray: Array<Int>
    ) {
        arrayList.add(CitiesDetailData(stringArray[id], integerArray[id]))
    }



        fun fullItem(
           citiesDetailDataList: ArrayList<CitiesDetailData>,
           russiaText: Array<String>,
           russiaImage: Array<Int>,
       ):ArrayList<CitiesDetailData>{
           for(i in 0..4){
               addList(citiesDetailDataList, i, russiaText, russiaImage)
           }
           return citiesDetailDataList
       }

     fun createStringArray(context: Context, resource_id: Int): Array<String> {
        return context.resources.getStringArray(resource_id)
    }


    fun getLessons(context:Context):ArrayList<Lesson>{
        var lesson_list=ArrayList<Lesson>()

        var lesson_name = context.resources.getStringArray(R.array.lesson)

        for (i in 0..4) {
            lesson_list.add(Lesson(lesson_name[i]))
        }

        return  lesson_list
    }


    fun getDeparmentData(): Department {
        var department=Department("Yönetim Bilişim Sistemleri")

        return department
    }





}


