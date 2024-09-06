package com.alvarado.globalmobilityapp.presentation.viewmodel.state

import com.alvarado.globalmobilityapp.data.model.Item

/**
 * Clase sellada que representa los diferentes estados posibles de la interfaz de usuario para la lista de ítems.
 * Permite manejar y distinguir entre los distintos estados de carga, éxito y error en la vista.
 */
sealed class ItemsUiState {
    /**
     * Estado que indica que los ítems están en proceso de carga.
     * No contiene datos adicionales.
     */
    object Loading : ItemsUiState()

    /**
     * Estado que indica que los ítems se han cargado exitosamente.
     *
     * @property items Lista de ítems que se han cargado exitosamente.
     */
    data class Success(val items: List<Item>) : ItemsUiState()

    /**
     * Estado que indica que ocurrió un error al cargar los ítems.
     *
     * @property message Mensaje de error que describe el problema.
     */
    data class Error(val message: String) : ItemsUiState()
}
