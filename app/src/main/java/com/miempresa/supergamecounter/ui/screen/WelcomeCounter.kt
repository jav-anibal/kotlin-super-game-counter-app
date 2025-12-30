package com.miempresa.supergamecounter.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RootWelcomeCounter(name: String?) {

    var score by remember { mutableIntStateOf(0) }

    //Calculado automáticamente
    //.coerceAtMost(5) evitar pasar del nivel máximo
    var level by remember(score) {
        mutableIntStateOf((score / 5).coerceAtMost(5))
    }


    WelcomeScreenCounter(
        name = name,
        score = score,
        level = level,
        onIncrease = { score++ }


    )

}


fun getLevelColor(level: Int): Color {
    return when (level % 10) {
        0 -> Color.Magenta
        5 -> Color.Green
        else -> Color.Cyan
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreenCounter(name: String?, score: Int, level: Int, onIncrease: () -> Unit) {

    val levelColor = getLevelColor(level)

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    "Super Counter Game",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        color = Color.Red
                    )
                )
            })
        }
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Text(text = "Welcome ${name ?: ""}")
        }


    }


}

