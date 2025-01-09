package xyz.teamgravity.listitemdemo

import androidx.compose.ui.graphics.Color

data class FruitModel(
    val color: Color,
    val name: String,
    val description: String,
    val category: FruitCategory,
    val selected: Boolean = false
)
