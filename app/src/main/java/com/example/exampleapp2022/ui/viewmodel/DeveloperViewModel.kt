package com.example.exampleapp2022.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exampleapp2022.domain.GetDevelopersUseCase
import com.example.exampleapp2022.domain.GetRandomDeveloperUseCase
import com.example.exampleapp2022.domain.model.Developer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DeveloperViewModel @Inject constructor(
    private val getDevelopersUseCase: GetDevelopersUseCase,
    private val getRandomDeveloperUseCase: GetRandomDeveloperUseCase,
) : ViewModel() {

    val isProgress = MutableLiveData<Boolean>()
    val developerModel = MutableLiveData<Developer>()

    fun onCreate() {
        viewModelScope.launch {
            isProgress.postValue(true)
            val result = getDevelopersUseCase()
            if (!result.isNullOrEmpty()) {
                developerModel.postValue(result[0])
                isProgress.postValue(false)
            }
        }
    }

    fun randomDeveloper() {
        viewModelScope.launch {
            isProgress.postValue(true)
            val developer = getRandomDeveloperUseCase()
            developer?.let {
                developerModel.postValue(it)
            }
            isProgress.postValue(false)
        }
    }

}