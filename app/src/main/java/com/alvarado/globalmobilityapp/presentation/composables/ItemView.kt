package com.alvarado.globalmobilityapp.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.alvarado.globalmobilityapp.data.model.Item

/**
 * Componente composable que muestra la vista de un ítem con su imagen, nombre, estado, origen y ubicación.
 *
 * @param item El ítem que se va a mostrar en la vista.
 * @param index La posición del ítem en la lista, utilizada para alternar el color de fondo.
 */
@Composable
fun ItemView(item: Item, index: Int) {
    // Columna para organizar los elementos verticalmente
    Column(
        modifier = Modifier.background(if (index %2 == 0) Color.Cyan else Color.White).fillMaxSize().padding(45.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Muestra la imagen del ítem de manera asíncrona usando Coil
        AsyncImage(model = item.image, contentDescription = null)
        Text(text = "${item.name} (${item.status})", textAlign = TextAlign.Center, style = MaterialTheme.typography.headlineMedium.copy(
            fontWeight = FontWeight.ExtraBold
        ))
        Text(text = item.origin.name, textAlign = TextAlign.Left, style = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.ExtraBold
        ))
        Text(text = item.location.name, textAlign = TextAlign.Left, style = MaterialTheme.typography.bodySmall)
    }
}