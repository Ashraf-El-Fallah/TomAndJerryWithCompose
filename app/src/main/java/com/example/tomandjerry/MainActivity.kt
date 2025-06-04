package com.example.tomandjerry

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.tomandjerry.screens.JerryStoreScreen
import com.example.tomandjerry.screens.TomAccountScreen
import com.example.tomandjerry.screens.TomKitChenScreen
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.isAppearanceLightStatusBars = true
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        setContent {
//            TomAndJerryTheme {
            Scaffold { innerPadding ->
                JerryStoreScreen(modifier = Modifier.padding(innerPadding))
//                TomKitChenScreen(modifier = Modifier.padding(innerPadding))
//                TomAccountScreen(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(innerPadding)
//                )
            }
        }
    }
}

