package com.example.amphibians.network

import retrofit2.http.GET

interface AmphibianApiService {
    // https://android-kotlin-fun-mars-server.appspot.com/amphibians
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}