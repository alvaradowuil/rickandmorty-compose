package com.alvarado.globalmobilityapp.data.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Objeto Singleton que proporciona la instancia de Retrofit para realizar las llamadas API.
 */
object RetrofitInstance {
    // URL base de la API de Rick and Morty
    private const val BASE_URL = "https://rickandmortyapi.com/api/"

    // Interceptor para registrar la información de las solicitudes y respuestas HTTP
    val intercepter = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    // Cliente HTTP que incluye el interceptor para el registro de las solicitudes/respuestas
    val client = OkHttpClient.Builder().apply {
        this.addInterceptor(intercepter)
    }.build()

    // Instancia de ApiService
    val api: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }
}