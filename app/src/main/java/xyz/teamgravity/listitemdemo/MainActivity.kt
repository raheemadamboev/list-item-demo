package xyz.teamgravity.listitemdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
import xyz.teamgravity.listitemdemo.ui.theme.ListItemDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListItemDemoTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { padding ->
                    var fruits: ImmutableList<FruitModel> by remember { mutableStateOf(FruitProvider.VALUE) }

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                    ) {
                        items(
                            items = fruits,
                            key = { it.name }
                        ) { fruit ->
                            ListItem(
                                overlineContent = {
                                    Text(
                                        text = fruit.category.name
                                    )
                                },
                                headlineContent = {
                                    Text(
                                        text = fruit.name
                                    )
                                },
                                supportingContent = {
                                    Text(
                                        text = fruit.description
                                    )
                                },
                                leadingContent = {
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = null,
                                        tint = fruit.color
                                    )
                                },
                                trailingContent = {
                                    Checkbox(
                                        checked = fruit.selected,
                                        onCheckedChange = {
                                            fruits = fruits.map { if(it == fruit) fruit.copy(selected = !fruit.selected) else it }.toImmutableList()
                                        }
                                    )
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        fruits = fruits.map { if(it == fruit) fruit.copy(selected = !fruit.selected) else it }.toImmutableList()
                                    }
                            )
                            HorizontalDivider()
                        }
                    }
                }
            }
        }
    }
}