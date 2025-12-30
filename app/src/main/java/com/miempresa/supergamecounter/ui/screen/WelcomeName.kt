package com.miempresa.supergamecounter.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miempresa.supergamecounter.R
import com.miempresa.supergamecounter.ui.components.MyButton

@Preview
@Composable
fun RootWelcomeName() {

    var name by remember { mutableStateOf<String?>(null) }
    if (name == null) {
        WelcomeScreenName(
            //Cuando se llame a  ->onNameConfirmed<-
            // tomo el String y lo almaceno en entryName
            // y lo asigno a la variable name
            onNameConfirmed = { // nombre de la Lambda
                    entryName -> // parámetro de recibe
                name = entryName // cuerpo-asignación
            }
        )

    } else {
        RootWelcomeCounter(name = name)
    }


}



@Composable
// onNameConfirmed : (String) -> Unit [ es una función que recibe un String y no devuelve nada]
// se crea en @RootWelcomeName()
fun WelcomeScreenName(onNameConfirmed: (String) -> Unit) {

    var entryName by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.icon_mascota),
            contentDescription = "Mascota",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = entryName,
            onValueChange = { entryName = it },
            placeholder = { Text(text = "Ingrese su nombre") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)

        )

        Spacer(modifier = Modifier.height(20.dp))


        MyButton(onClick = {
            if (entryName.isNotBlank()) {
                onNameConfirmed(entryName)
            }

        })


    }


}