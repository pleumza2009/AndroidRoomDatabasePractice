package com.pleum.practiceroomdatabase1.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class School(
    @PrimaryKey(autoGenerate = false)
    val schoolName: String
)