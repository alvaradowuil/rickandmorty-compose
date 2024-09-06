# Aplicación Android con Jetpack Compose

Esta es una aplicación Android que utiliza Jetpack Compose para mostrar una lista de personajes obtenida del endpoint [Rick and Morty API](https://rickandmortyapi.com/api/character). La aplicación está construida utilizando las siguientes tecnologías y patrones:

- **Jetpack Compose**: para la construcción de la interfaz de usuario.
- **MVVM**: patrón de arquitectura para separar las responsabilidades.
- **LiveData**: para la gestión y observación de datos.
- **Coroutines**: para manejar operaciones asincrónicas.
- **Sealed Classes**: para manejar estados en la UI.
- **Coil**: para cargar y mostrar imágenes.

## Enlaces a la Documentación

- **[Jetpack Compose](https://developer.android.com/jetpack/compose)**: Documentación oficial de Jetpack Compose.
- **[MVVM (Model-View-ViewModel)](https://developer.android.com/topic/libraries/architecture/viewmodel)**: Documentación sobre el patrón MVVM en Android.
- **[LiveData](https://developer.android.com/topic/libraries/architecture/livedata)**: Documentación sobre LiveData.
- **[Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)**: Introducción a las corutinas en Kotlin.
- **[Sealed Classes](https://kotlinlang.org/docs/sealed-classes.html)**: Documentación sobre las clases selladas en Kotlin.
- **[Coil](https://coil-kt.github.io/coil/)**: Documentación sobre la biblioteca Coil para cargar imágenes en Android.

## Configuración del Proyecto

1. Clona este repositorio:
    ```bash
    git clone <URL_DEL_REPOSITORIO>
    ```

2. Abre el proyecto en Android Studio.

3. Sincroniza el proyecto con Gradle.

4. Ejecuta la aplicación en un emulador o dispositivo físico.

## Estructura del Proyecto

- **Data**: Contiene modelos de datos y fuentes de datos.
- **Presentation**: Contiene la lógica de la interfaz de usuario y la implementación de Jetpack Compose.
