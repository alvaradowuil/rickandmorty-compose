package com.alvarado.globalmobilityapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Objeto que define la estructura del Origin para cada item
 */
data class Origin(
    @SerializedName("name")
    val name: String
)
