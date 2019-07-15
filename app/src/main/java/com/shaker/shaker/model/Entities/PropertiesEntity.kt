package com.shaker.shaker.model.Entities

import kotlinx.serialization.Serializable

@Serializable
data class PropertiesEntity(
    val coordinates: ArrayList<Double>,
    val latitude: Double,
    val longitude: Double,
    val depth: Double
) {

}
