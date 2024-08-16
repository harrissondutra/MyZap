package com.estudo.myzap.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun ComunidadesScreen(modifier: Modifier = Modifier) {
    Box (Modifier.fillMaxSize()) {
        Text(
            text = "Comunidades",
            modifier = Modifier.align(Alignment.Center),
            style = TextStyle.Default.copy(fontSize = 32.sp)
        )
    }
}
