package com.miempresa.supergamecounter.ui.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun RootWelcomeCounter(name: String?) {
    var name by remember { mutableStateOf("") }
    var score by remember { mutableIntStateOf(0) }

    //Calculado automáticamente
    //.coerceAtMost(5) evitar pasar del nivel máximo
    var level by remember(score) {
        mutableIntStateOf((score / 5).coerceAtMost(5))
    }

    //Funciones
    fun increaseScore() {
        score++
    }

}

@Composable
fun WelcomeScreenCounter() {


}

@Composable
fun MyButton(modifier: Modifier = Modifier, onClick: () -> Unit) {

    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = "Enviar")
    }


}