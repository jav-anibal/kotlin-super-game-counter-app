package com.miempresa.supergamecounter.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun RootWelcomeName() {

    var name by remember { mutableStateOf<String?>(null) }
    if(name == null){
        WelcomeScreenName(
            //Cuando se llame a  ->onNameConfirmed<-
            // tomo el String y lo almaceno en entryName
            // y lo asigno a la variable name
            onNameConfirmed = { // nombre de la Lambda
                entryName -> // parámetro de recibe
                name = entryName // cuerpo-asignación
            }
        )

    }else{
        RootWelcomeCounter(name = name)
    }


}


@Composable
// onNameConfirmed : (String) -> Unit [ es una función que recibe un String y no devuelve nada]
// se crea en @RootWelcomeName()
fun WelcomeScreenName( onNameConfirmed : (String) -> Unit){




}