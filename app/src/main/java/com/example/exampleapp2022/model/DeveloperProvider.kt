package com.example.exampleapp2022.model

class DeveloperProvider {
    companion object {

        fun random(): DeveloperModel {
            val position = (developers.indices).random()
            return developers[position]
        }

        private val developers = listOf(
            DeveloperModel(
                speciality = "Ios Developer",
                author = "Angelo??"
            ),
            DeveloperModel(
                speciality = "“Software Developer”",
                author = "Chapero"
            ),
            DeveloperModel(
                speciality = "FrontEnd Developer",
                author = "Fabrizio"
            ),
            DeveloperModel(
                speciality = "DBA",
                author = "Alvaro"
            ),
        )
    }
}