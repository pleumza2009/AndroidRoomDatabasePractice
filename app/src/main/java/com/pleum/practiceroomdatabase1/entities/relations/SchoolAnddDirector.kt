package com.pleum.practiceroomdatabase1.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.pleum.practiceroomdatabase1.entities.Director
import com.pleum.practiceroomdatabase1.entities.School

data class SchoolAnddDirector (
   @Embedded  val school : School,
   @Relation(
       parentColumn ="schoolName",
       entityColumn = "schoolName"
   )
   val director: Director
        )