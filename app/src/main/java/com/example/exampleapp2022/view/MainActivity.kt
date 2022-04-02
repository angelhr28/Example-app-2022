package com.example.exampleapp2022.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.exampleapp2022.databinding.ActivityMainBinding
import com.example.exampleapp2022.viewmodel.DeveloperViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val developerViewModel: DeveloperViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        developerViewModel.developerModel.observe(this) {
            binding.lblSpeciality.text = it.speciality
            binding.lblDeveloper.text = it.author
        }

        binding.viewContainer.setOnClickListener { developerViewModel.randomDeveloper() }
    }
}