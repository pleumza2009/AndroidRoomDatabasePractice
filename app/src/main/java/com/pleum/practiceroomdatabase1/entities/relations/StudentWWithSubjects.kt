package com.pleum.practiceroomdatabase1.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.pleum.practiceroomdatabase1.entities.Student
import com.pleum.practiceroomdatabase1.entities.Subject

data class StudentWWithSubjects (
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects:List<Subject>
        )