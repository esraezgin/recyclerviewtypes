package com.example.recyclerviewtype.nested.model

data class CitiesData(
    var nationalName:String,
    var cityList:ArrayList<CitiesDetailData>
) {

}
