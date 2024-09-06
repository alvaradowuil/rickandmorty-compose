package com.alvarado.globalmobilityapp.presentation.composables

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alvarado.globalmobilityapp.presentation.viewmodel.state.ItemsUiState
import com.alvarado.globalmobilityapp.presentation.viewmodel.MainViewModel

/**
 * Componente composable que muestra una lista de ítems basada en el estado del ViewModel.
 *
 * @param modifier Modificador opcional para ajustar la apariencia y el tamaño del componente.
 * @param viewModel Instancia del ViewModel que proporciona el estado de la interfaz de usuario y los ítems.
 */
@Composable
fun ItemList(modifier: Modifier = Modifier, viewModel: MainViewModel) {
    // Obtiene el estado actual de la interfaz de usuario desde el ViewModel
    val uiState = viewModel.uiState.value
    Surface(modifier) {

        // Valida el estado actual de la UI y muestra el contenido apropiado
        when(uiState) {

            // Estado Loading para mostrar un progress
            is ItemsUiState.Loading -> {
                CircularProgressIndicator(modifier = Modifier.then(Modifier.size(32.dp)))
            }

            // Estado Success retorna los datos obtenidos
            is ItemsUiState.Success -> {
                LazyColumn {
                    itemsIndexed(uiState.items) { index, item ->
                        ItemView(item = item, index)
                    }
                }
            }

            // Estado Error, Muestra un texto con el mensaje de error
            is ItemsUiState.Error -> {
                Text(text = uiState.message)
            }
        }
    }

    // DisposableEffect se utiliza para ejecutar codigo al montar un componente
    DisposableEffect(Unit) {
        // Llama a la función para obtener los ítems cuando el componente se monta
        viewModel.getItems()
        // Limpia los efectos cuando el componente se desmonta (vacío en este caso)
        onDispose {}
    }
}