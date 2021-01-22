package com.pleum.practiceroomdatabase1.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.pleum.practiceroomdatabase1.entities.School
import com.pleum.practiceroomdatabase1.entities.Student

data class SchoolWithStudents (
    @Embedded val school : School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn =  "schoolName"
    )
    val students : List<Student>
        )

