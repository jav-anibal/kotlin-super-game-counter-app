package com.miempresa.supergamecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.miempresa.supergamecounter.ui.screen.RootWelcomeCounter
import com.miempresa.supergamecounter.ui.screen.RootWelcomeName
import com.miempresa.supergamecounter.ui.theme.SuperGameCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperGameCounterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RootWelcomeName(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
