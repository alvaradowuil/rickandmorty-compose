package com.alvarado.globalmobilityapp.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alvarado.globalmobilityapp.data.api.RetrofitInstance
import com.alvarado.globalmobilityapp.presentation.viewmodel.state.ItemsUiState
import kotlinx.coroutines.launch

/**
 * ViewModel para gestionar el estado de la interfaz de usuario y la obtención de ítems desde la API.
 */
class MainViewModel: ViewModel() {
    private val apiService = RetrofitInstance.api

    val uiState = mutableStateOf<ItemsUiState>(ItemsUiState.Loading)

    /**
     * Obtiene los ítems desde la API y actualiza el estado de la UI según la respuesta.
     * Se ejecuta en un coroutine en el scope del ViewModel.
     */
    fun getItems() {
        viewModelScope.launch {
            // Establece el estado de la UI a 'Loading' mientras se realiza la solicitud
            uiState.value = ItemsUiState.Loading
            try {
                // Realiza la solicitud a la API para obtener los ítems
                val response = apiService.getCharacters()
                response.results?.let {
                    // Verifica si la lista de ítems no está vacía y actualiza el estado en consecuencia
                    if (response.results.isNotEmpty()) {
                        uiState.value = ItemsUiState.Success(it)
                    } else {
                        // Estado de error si no se encuentran elementos
                        uiState.value = ItemsUiState.Error("No items found")
                    }
                }
            } catch (e: Exception) {
                // Establece un estado de error si ocurre una excepción durante la solicitud
                uiState.value = ItemsUiState.Error("Error loading items: ${e.message}")
            }
        }
    }
}