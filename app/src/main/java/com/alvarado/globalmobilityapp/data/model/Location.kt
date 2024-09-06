package com.alvarado.globalmobilityapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Objeto que define la estructura del Location para cada item
 */
data class Location(
    @SerializedName("name")
    val name: String
)
