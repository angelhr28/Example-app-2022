package com.example.exampleapp2022.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.exampleapp2022.domain.model.Developer

@Entity(tableName = "developer_table")
data class DeveloperEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "quote") val speciality: String,
    @ColumnInfo(name = "author") val author: String,
)

fun Developer.toDatabase() = DeveloperEntity(speciality = speciality, author = author)