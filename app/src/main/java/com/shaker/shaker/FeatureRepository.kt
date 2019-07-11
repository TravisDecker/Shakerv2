package com.shaker.shaker

import androidx.lifecycle.LiveData
import com.shaker.shaker.Entities.FeatureEntity

class FeatureRepository(private val featureDao: FeatureDao) {

    val allFeatures: LiveData<List<FeatureEntity>> = featureDao.selectAll()

    suspend fun insert(features: List<FeatureEntity>) {
        featureDao.insert(features)
    }
}