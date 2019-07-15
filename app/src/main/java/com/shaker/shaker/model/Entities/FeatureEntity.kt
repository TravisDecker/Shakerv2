package com.shaker.shaker.model.Entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "Features")
data class FeatureEntity(
    @PrimaryKey @NonNull val featureId: Int,
    val featureType: String,
    val properties: PropertiesEntity,
    val Geometry: GeometryEntity
) {

}
