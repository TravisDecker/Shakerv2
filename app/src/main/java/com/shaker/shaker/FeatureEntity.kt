package com.shaker.shaker

import androidx.annotation.NonNull
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
data class FeatureEntity(
    @PrimaryKey @NonNull val featureId: Int,
    val featureType: String,
    val properties: PropertiesEntity,
    val Geometry: GeometryEntity
) {

}
