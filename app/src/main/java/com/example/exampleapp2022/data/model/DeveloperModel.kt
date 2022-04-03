package com.example.exampleapp2022.data.model

import com.google.gson.annotations.SerializedName

data class DeveloperModel(
    @SerializedName("quote") val speciality: String,
    @SerializedName("author") val author: String
)