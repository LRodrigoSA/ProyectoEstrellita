package com.example.proyectoestrellita

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Usec(irInicio: () -> Unit){

    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text("Usec",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

        )
    }
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Emblema",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp

        )
        Image(
            painter = painterResource(id = R.drawable.usec),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
        )

        val descripcion = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 20.sp)) {
                append("USEC es una Compañía Militar Privada establecida en el extranjero, empleada por Terra Group Labs como un subcontratista de seguridad.El principal objetivo de USEC es destruir cualquier prueba potencial de sus actividades ilegales de sus activos y proteger sus propiedades de ser capturadas por BEAR.")
            }

        }
        Text(
            text = descripcion,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Button(onClick = irInicio) {
            Text("Volver")
        }
    }

}