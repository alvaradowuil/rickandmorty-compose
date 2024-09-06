package com.alvarado.globalmobilityapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Objeto que define la estructura de cada elemento de la lista
 */
data class Item(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("location")
    val location: Location
)
