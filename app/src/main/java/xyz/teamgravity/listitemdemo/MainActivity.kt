package xyz.teamgravity.listitemdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
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
                }
            }
        }
    }
}