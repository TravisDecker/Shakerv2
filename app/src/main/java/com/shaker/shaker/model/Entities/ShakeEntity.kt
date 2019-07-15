package com.shaker.shaker.model.Entities

import kotlinx.serialization.Serializable

@Serializable
data class ShakeEntity(
    val type: String,
    val metaData: MetaDataEntity
) {
    lateinit var features: List<FeatureEntity>
}