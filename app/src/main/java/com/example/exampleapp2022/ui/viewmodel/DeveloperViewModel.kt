package com.example.exampleapp2022.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exampleapp2022.data.model.DeveloperModel
import com.example.exampleapp2022.domain.GetDevelopers
import com.example.exampleapp2022.domain.GetRandomDeveloper
import kotlinx.coroutines.launch

class DeveloperViewModel : ViewModel() {

    val isProgress = MutableLiveData<Boolean>()
    val developerModel = MutableLiveData<DeveloperModel>()

    var getDevelopers = GetDevelopers()
    var getRandomDeveloper = GetRandomDeveloper()

    fun onCreate() {
        viewModelScope.launch {
            isProgress.postValue(true)
            val result = getDevelopers()
            if (!result.isNullOrEmpty()) {
                developerModel.postValue(result[0])
                isProgress.postValue(false)
            }
        }
    }

    fun randomDeveloper() {
        isProgress.postValue(true)
        val currentDeveloper = getRandomDeveloper()
        currentDeveloper?.let {
            developerModel.postValue(it)
            isProgress.postValue(false)
        }
    }

}