package com.arbeat.movieapps.domain

import java.io.Serializable

data class FilmItemModel(
    var title:String="",
    var description:String="",
    var poster:String="",
    var time:String="",
    var trailer:String="",
    var imdb:String="",
    var year:String="",
    var price:Double=0.0,
    var genre:ArrayList<String> = arrayListOf(),
    var castModel:ArrayList<CastModel> = arrayListOf()
): Serializable
