package com.arbeat.movieapps.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.arbeat.movieapps.domain.FilmItemModel
import com.arbeat.movieapps.repository.MainRepository

class MainViewModel:ViewModel() {
    private val repository = MainRepository()

    fun loadUpcoming(): LiveData<MutableList<FilmItemModel>>{
        return repository.loadUpcoming()
    }

    fun loadItem(): LiveData<MutableList<FilmItemModel>>{
        return repository.loadItems()
    }
}