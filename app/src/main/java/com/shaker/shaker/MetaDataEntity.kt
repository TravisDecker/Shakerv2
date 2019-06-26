package com.shaker.shaker

import kotlinx.serialization.Serializable

@Serializable
data class MetaDataEntity(
    val generated: Long,
    val url: String,
    val title: String,
    val status: Long,
    val api: String,
    val count: Long
) {

}