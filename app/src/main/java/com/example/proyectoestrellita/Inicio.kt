package com.example.proyectoestrellita

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Inicio(
    irUsec: () -> Unit,
    irBear: () -> Unit
) {

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.eft),
            contentDescription = null,
            modifier = Modifier
                .size(350.dp)
        )
        Button(onClick = irUsec) {
            Text("Ir a Usec")
        }

        Button(onClick = irBear) {
            Text("Ir a Bear")
        }
    }
}
