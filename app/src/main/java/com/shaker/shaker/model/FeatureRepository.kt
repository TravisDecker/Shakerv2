package com.shaker.shaker.model

import androidx.lifecycle.LiveData
import com.shaker.shaker.model.Entities.FeatureEntity

class FeatureRepository(private val featureDao: FeatureDao) {

    val allFeatures: LiveData<List<FeatureEntity>> = featureDao.selectAll()

    suspend fun insert(features: List<FeatureEntity>) {
        featureDao.insert(features)
    }


}