package xyz.teamgravity.listitemdemo

import androidx.compose.ui.graphics.Color
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

object FruitProvider {
    val VALUE: ImmutableList<FruitModel> = persistentListOf(
        FruitModel(
            color = Color(0xFFB22222),
            name = "Strawberry",
            description = "Sweet and juicy",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFFFD700),
            name = "Pineapple",
            description = "Tropical and sweet",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFF66BB6A),
            name = "Lime",
            description = "Tart and zesty",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFF1E90FF),
            name = "Blueberry",
            description = "Sweet and juicy",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFFFA500),
            name = "Mango",
            description = "Tropical and sweet",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFFFFA07A),
            name = "Orange",
            description = "Citrusy and sweet",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFF8BC34A),
            name = "Kiwi",
            description = "Sweet and tart",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFF8A2BE2),
            name = "Plum",
            description = "Sweet and juicy",
            category = FruitCategory.Drupes
        ),
        FruitModel(
            color = Color(0xFF00CED1),
            name = "Coconut",
            description = "Creamy and tropical",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFFFF69B4),
            name = "Dragonfruit",
            description = "Exotic and sweet",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFFFFEB3B),
            name = "Banana",
            description = "Creamy and sweet",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFFFFC0CB),
            name = "Peach",
            description = "Fuzzy and sweet",
            category = FruitCategory.Drupes
        ),
        FruitModel(
            color = Color(0xFF4CAF50),
            name = "Green Apple",
            description = "Crisp and tart",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFFFFC107),
            name = "Watermelon",
            description = "Juicy and refreshing",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFF8A2BE2),
            name = "Blackberry",
            description = "Rich and sweet",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFF00BFFF),
            name = "Blue Raspberry",
            description = "Sweet and tangy",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFFFA500),
            name = "Tangerine",
            description = "Citrusy and sweet",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFFFFE4C4),
            name = "Nectarine",
            description = "Sweet and juicy",
            category = FruitCategory.Drupes
        ),
        FruitModel(
            color = Color(0xFFF0FFF0),
            name = "Honeydew",
            description = "Sweet and mild",
            category = FruitCategory.Melon
        ),
        FruitModel(
            color = Color(0xFFF5F5DC),
            name = "Casaba Melon",
            description = "Mild and sweet",
            category = FruitCategory.Melon
        ),
        FruitModel(
            color = Color(0xFFDC143C),
            name = "Cranberry",
            description = "Tart and refreshing",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFCD5C5C),
            name = "Starfruit",
            description = "Tart and sweet",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFFFFE4B5),
            name = "Maracuja",
            description = "Tropical and tangy",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFF8B0000),
            name = "Blackcurrant",
            description = "Rich and tart",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFFFDAB9),
            name = "Lychee",
            description = "Sweet and floral",
            category = FruitCategory.Tropical
        ),
        FruitModel(
            color = Color(0xFF4CAF50),
            name = "Avocado",
            description = "Creamy and nutty",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFFFC0CB),
            name = "Raspberry",
            description = "Sweet and tart",
            category = FruitCategory.Berry
        ),
        FruitModel(
            color = Color(0xFFD8BFD8),
            name = "Olive",
            description = "Savory and rich",
            category = FruitCategory.Drupes
        ),
        FruitModel(
            color = Color(0xFF8A2BE2),
            name = "Blue Plum",
            description = "Sweet and juicy",
            category = FruitCategory.Drupes
        ),
        FruitModel(
            color = Color(0xFFFF6347),
            name = "Tomato",
            description = "Juicy and savory",
            category = FruitCategory.Citrus
        ),
        FruitModel(
            color = Color(0xFFDABF20),
            name = "Figs",
            description = "Sweet and chewy",
            category = FruitCategory.Drupes
        )
    )

}
