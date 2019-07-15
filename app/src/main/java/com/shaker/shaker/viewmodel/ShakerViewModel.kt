package com.shaker.shaker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.shaker.shaker.model.Entities.FeatureEntity
import com.shaker.shaker.model.FeatureDao
import com.shaker.shaker.model.FeatureDatabase
import com.shaker.shaker.model.FeatureRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShakerViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: FeatureRepository
    val allFeatures: LiveData<List<FeatureEntity>>


    init {
        val featureDao: FeatureDao = FeatureDatabase.getDatabase(application).featureDao()
        repository = FeatureRepository(featureDao)
        allFeatures = repository.allFeatures
    }

    fun insert(features: List<FeatureEntity>) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(features)
    }
}