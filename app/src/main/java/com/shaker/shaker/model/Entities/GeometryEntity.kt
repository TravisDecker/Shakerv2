package com.shaker.shaker.model.Entities

import kotlinx.serialization.Serializable

@Serializable
data class GeometryEntity(
    val mag: Double,
    val place: String,
    val time: Long,
    val updated: Long,
    val url: String,
    val felt: Long,
    val alert: String,
    val status: String,
    val net: String,
    val ids: String,
    val nst: Long,
    val title: String
) {

}
