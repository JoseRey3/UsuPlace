package com.example.usuplace

sealed class placeCategory {
    object parque : placeCategory()
    object piscina : placeCategory()
    object montañas : placeCategory()
    object cerros : placeCategory()
}