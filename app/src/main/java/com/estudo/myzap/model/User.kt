package com.estudo.myzap.model

import android.media.Image
import androidx.compose.ui.graphics.vector.ImageVector

data class User(
    val id: Int? = null,
    val name: String,
    val message: String,
    val time: String,
    val image: Int
)
