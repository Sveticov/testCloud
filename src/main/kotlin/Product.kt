package com.svetikov

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: String,
    val nameProduct: String,
    val price: Float,
    val descriptionProduct: String
)
