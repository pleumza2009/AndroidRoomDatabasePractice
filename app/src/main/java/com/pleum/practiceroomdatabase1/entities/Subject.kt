package com.pleum.practiceroomdatabase1.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Subject (
    @PrimaryKey(autoGenerate = false)
    val subjectName:String
    )