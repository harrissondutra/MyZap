package com.estudo.myzap.sampledata

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.Chat
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
import com.estudo.myzap.R
import com.estudo.myzap.model.NavItem
import com.estudo.myzap.model.User

val itemsNavSample = listOf(
    NavItem(icon = Icons.AutoMirrored.Outlined.Chat, blackIcon = Icons.AutoMirrored.Filled.Chat, label = "Conversas"),
    NavItem(icon = Icons.Filled.Update,  blackIcon = Icons.Default.Update, label = "Atualizações"),
    NavItem(icon = Icons.Outlined.Groups, blackIcon = Icons.Rounded.Groups, label = "Comunidades"),
    NavItem(icon = Icons.Outlined.Phone, blackIcon = Icons.Rounded.Phone, label = "Ligações"),
)

val sampleChats = listOf(
    User(1, "João", "Oi, tudo bem?", "10:00", image = R.drawable.user),
    User(2, "Maria", "Oi, tudo bem?", "11:15", image = R.drawable.user_wom_1),
    User(3, "José", "Oi, tudo bem?", "08:22", image = R.drawable.user_man_2),
    User(4, "Ana", "Oi, tudo bem?", "05:46", image = R.drawable.user_wom_2),
    User(5, "Carlos", "Oi, tudo bem?", "22:00", image = R.drawable.people_1),
    User(6, "Mariana", "Oi, tudo bem?", "15:30", image = R.drawable.user_wom_3),
    User(7, "Pedro", "Oi, tudo bem?", "12:00", image = R.drawable.user_man_6),
    User(8, "Paula", "Oi, tudo bem?", "09:00", image = R.drawable.user_wom_4),
    User(9, "Lucas", "Oi, tudo bem?", "07:00", image = R.drawable.user_man_3),
    User(10, "Alex", "Oi, tudo bem?", "06:00", image = R.drawable.user_man_5),
    User(11, "Família", "Oi, tudo bem?", "04:00", image = R.drawable.people_1),
)

val sampleChips = listOf(
    "Todas",
    "Não Lidas",
    "Favoritos",
    "Grupos",
)

