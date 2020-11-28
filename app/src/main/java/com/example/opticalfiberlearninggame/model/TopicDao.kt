package com.example.opticalfiberlearninggame.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TopicDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTopics(topics: List<Topic>)

    @Query("Select * from Topic")
    fun getTopics(): LiveData<List<Topic>>

    @Query("Delete from Topic")
    fun deleteAll()
}