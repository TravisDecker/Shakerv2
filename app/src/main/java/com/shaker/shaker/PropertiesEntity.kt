package com.shaker.shaker

import kotlinx.serialization.Serializable

@Serializable
data class PropertiesEntity(
    val coordinates: ArrayList<Double>,
    val latitude: Double,
    val longitude: Double,
    val depth: Double
) {

}
