package com.shaker.shaker

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shaker.shaker.Entities.FeatureEntity

@Dao
interface FeatureDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(features: List<FeatureEntity>)


    @Query("SELECT * FROM Features")
    fun selectAll(): List<FeatureEntity>

}