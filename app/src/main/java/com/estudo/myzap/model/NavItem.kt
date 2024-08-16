package com.estudo.myzap.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val icon: ImageVector,
    val blackIcon: ImageVector,
    val label: String,
){
    data object Conversas : NavItem(
        icon = Icons.AutoMirrored.Outlined.Chat,
        blackIcon = Icons.AutoMirrored.Filled.Chat,
        label = "Conversas"
    )
    data object Atualizacoes : NavItem(
        icon = Icons.Filled.Update,
        blackIcon = Icons.Default.Update,
        label = "Atualizações"
    )
    data object Comunidades : NavItem(
        icon = Icons.Outlined.Groups,
        blackIcon = Icons.Rounded.Groups,
        label = "Comunidades"
    )
    data object Ligacoes : NavItem(
        icon = Icons.Outlined.Phone,
        blackIcon = Icons.Rounded.Phone,
        label = "Ligações"
    )
}
