package com.estudo.myzap.sampledata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Campaign
import androidx.compose.material.icons.filled.Devices
import androidx.compose.material.icons.filled.DomainAdd
import androidx.compose.material.icons.filled.GroupAdd
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.StarOutline
import com.estudo.myzap.model.MenuItem

val sampleMenu = listOf(
    MenuItem(title = "Novo Grupo", icon = Icons.Default.GroupAdd),
    MenuItem(title = "Nova Transmissão", icon = Icons.Default.Campaign),
    MenuItem(title = "Dispositivos conectados", icon = Icons.Default.Devices),
    MenuItem(title = "Mensagens favoritas", icon = Icons.Default.StarOutline),
    MenuItem(title = "Encontrar empresas", icon = Icons.Default.DomainAdd),
    MenuItem(title = "Pagamentos", icon = Icons.Default.Payment),
    MenuItem(title = "Configurações", icon = Icons.Default.Settings),
)