package com.alvarado.globalmobilityapp.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.alvarado.globalmobilityapp.presentation.composables.ItemList
import com.alvarado.globalmobilityapp.presentation.viewmodel.MainViewModel
import com.alvarado.globalmobilityapp.presentation.ui.theme.GlobalMobilityAppTheme

/**
 * Actividad principal para gestionar la interfaz de usuario de la aplicación.
 */
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configura la actividad para usar un diseño de borde a borde
        enableEdgeToEdge()

        setContent {
            // Aplica el tema global a la interfaz de usuario
            GlobalMobilityAppTheme {

                // Muestra la lista de ítems y pasa el ViewModel
                ItemList(modifier = Modifier.fillMaxSize(), viewModel = viewModel)
            }
        }
    }
}