package com.alvarado.globalmobilityapp.data.api

import com.alvarado.globalmobilityapp.data.response.ItemsResponse
import retrofit2.http.GET

interface ApiService {
    /**
     * Realiza una solicitud GET al endpoint "character" para obtener una lista de personajes.
     *
     * @return ItemsResponse La respuesta que contiene una lista de personajes.
     * La función es de tipo "suspend", lo que significa que debe llamarse desde una corrutina o
     * una función suspend para ejecutarse de forma asíncrona.
     */
    @GET("character")
    suspend fun getCharacters(): ItemsResponse
}