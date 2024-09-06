package com.alvarado.globalmobilityapp.data.response

import com.alvarado.globalmobilityapp.data.model.Item
import com.google.gson.annotations.SerializedName

/**
 * Representa la respuesta de una solicitud que contiene una lista de ítems.
 */
data class ItemsResponse(
    @SerializedName("results")
    val results: List<Item>?
)
