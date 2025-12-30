package com.miempresa.supergamecounter.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text : String
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red, // Fondo del botón
            contentColor = Color.Black   // Color del texto
        )
    ) {
        Text(text = text)
    }
}