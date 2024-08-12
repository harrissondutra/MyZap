package com.estudo.myzap.ui.components

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.estudo.myzap.sampledata.sampleChips

@Composable
fun Chip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val chips = sampleChips
    val backgroundColor = if (isSelected) {
        MaterialTheme.colorScheme.primaryContainer
    } else {
        MaterialTheme.colorScheme.secondaryContainer
    }
    val textColor = if (isSelected) {
        MaterialTheme.colorScheme.onPrimaryContainer
    } else {
        MaterialTheme.colorScheme.onSecondaryContainer
    }
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(percent = 100))
            .background(backgroundColor)
            .clickable(onClick = onClick)
    ) {
        val chipsList = chips.listIterator(
            chips.indexOf(label)
        )
        Text(
            text = chipsList.next(),
            color = textColor,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(horizontal = 14.dp, vertical = 8.dp)
        )
    }
}