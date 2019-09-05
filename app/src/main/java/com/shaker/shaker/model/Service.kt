package com.shaker.shaker.model


import com.shaker.shaker.model.Entities.ShakeEntity
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET


private const val BASE_URL = "https://earthquake.usgs.gov/fdsnws/event/1/"

private val retrofit = Retrofit.Builder()

    .baseUrl(BASE_URL)
    .build()

interface ApiService {

    @GET("query?format=geojson&limit=20000")
    fun get(): Call<ShakeEntity>
}

object ShakerService {
    val retrofitservice: ApiService by lazy { retrofit.create(ApiService::class.java) }
}