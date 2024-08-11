package com.estudo.myzap.sampledata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.PeopleOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Update
import androidx.compose.material.icons.outlined.ChatBubble
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.Phone
import com.estudo.myzap.model.NavItem

val itemsNavSample = listOf(
    NavItem(icon = Icons.Filled.ChatBubbleOutline, blackIcon = Icons.AutoMirrored.Filled.Chat, label = "Conversas"),
    NavItem(icon = Icons.Filled.Update,  blackIcon = Icons.Default.Update, label = "Atualizações"),
    NavItem(icon = Icons.Outlined.Groups, blackIcon = Icons.Rounded.Groups, label = "Comunidades"),
    NavItem(icon = Icons.Outlined.Phone, blackIcon = Icons.Rounded.Phone, label = "Ligações"),
)