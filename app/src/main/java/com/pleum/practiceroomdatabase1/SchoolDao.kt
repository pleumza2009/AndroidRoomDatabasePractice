package com.pleum.practiceroomdatabase1

import androidx.room.*
import com.pleum.practiceroomdatabase1.entities.Director
import com.pleum.practiceroomdatabase1.entities.School
import com.pleum.practiceroomdatabase1.entities.Student
import com.pleum.practiceroomdatabase1.entities.Subject
import com.pleum.practiceroomdatabase1.entities.relations.*

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertSchool(school : School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertDirector(director: Director )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertStudent(student: Student )

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef )

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAnddDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getShcoolWithStudents(schoolName : String) : List<SchoolWithStudents>

    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName = :subjectName")
    suspend fun gentStudentsOfSubject(subjectName : String) : List<SubjectWithStudents>

    @Transaction
    @Query("SELECT * FROM student WHERE studentName = :studentName")
    suspend fun getSubjectOfStudent(studentName : String) : List<StudentWWithSubjects>
}