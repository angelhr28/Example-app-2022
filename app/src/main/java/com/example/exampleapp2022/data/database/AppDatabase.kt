package com.example.exampleapp2022.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.exampleapp2022.data.database.dao.DeveloperDao
import com.example.exampleapp2022.data.database.entities.DeveloperEntity

@Database(entities = [DeveloperEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun developerDao(): DeveloperDao
}