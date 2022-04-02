package com.example.exampleapp2022.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.exampleapp2022.model.DeveloperModel
import com.example.exampleapp2022.model.DeveloperProvider

class DeveloperViewModel : ViewModel() {

    val developerModel = MutableLiveData<DeveloperModel>()

    fun randomDeveloper() {
        val currentDeveloper = DeveloperProvider.random()
        developerModel.postValue(currentDeveloper)
    }

}