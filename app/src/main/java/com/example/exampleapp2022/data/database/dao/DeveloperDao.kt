package com.example.exampleapp2022.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.exampleapp2022.data.database.entities.DeveloperEntity

@Dao
interface DeveloperDao {

    @Query("SELECT * FROM developer_table ORDER BY author DESC")
    suspend fun getAllDeveloper(): List<DeveloperEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(developers: List<DeveloperEntity>)

    @Query("DELETE FROM developer_table")
    suspend fun clearAll()
}