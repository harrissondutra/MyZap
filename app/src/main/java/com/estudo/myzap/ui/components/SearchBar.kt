package com.estudo.myzap.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(searchText: String, onSearchChanged: (String) -> Unit) {

    OutlinedTextField(
        value = "",
        onValueChange = { newValue ->
            onSearchChanged(newValue)
        },
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(100),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Imagem de lupa"
            )
        },
        label = {
            Text(text = searchText)
        },
        placeholder = {
            Text(text = "O que você procura?")
        }

    )
}
