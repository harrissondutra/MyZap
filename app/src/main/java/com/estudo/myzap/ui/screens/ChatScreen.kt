package com.estudo.myzap.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.estudo.myzap.sampledata.sampleChats
import com.estudo.myzap.sampledata.sampleChips
import com.estudo.myzap.ui.components.ItemChat
import com.estudo.myzap.ui.components.SearchTextField

@Composable
fun ChatScreen() {

        val chat = sampleChats
        val chatSize = sampleChats.size
        val chips = sampleChips

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            item {
                SearchTextField(
                    searchText = "Search",
                    onSearchChanged = {}
                )
            }
            /*  items(chips.size) { index ->
                  Chip(
                      label = chips[index],
                      isSelected = index == 0,
                      onClick = {}
                  )
              }*/
            items(chatSize) { user ->
                ItemChat(user = chat[user])

            }

        }



}