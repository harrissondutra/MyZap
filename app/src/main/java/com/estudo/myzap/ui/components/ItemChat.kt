package com.estudo.myzap.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.myzap.R
import com.estudo.myzap.model.User
import com.estudo.myzap.ui.theme.GrayLight

@Composable
fun ItemChat(
    user: User,
) {
    val imageSize = 60.dp
    Row(
        Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(user.image),
            contentDescription = null,
            modifier = Modifier
                .size(imageSize)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column (Modifier.fillMaxWidth(0.8f).padding(start = 8.dp)) {
            Text(
                text = user.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = user.message,
                fontSize = 14.sp,
                color = GrayLight,
            )


        }
        Column(
            Modifier.padding(
                start = 8.dp,
                end = 16.dp,
                top = 16.dp,
                bottom = 8.dp
            )
        ) {
            Text(
                text = user.time,
                fontSize = 14.sp,
                modifier = Modifier.align(Alignment.End),
                overflow = TextOverflow.Ellipsis,
                color = GrayLight
            )
        }
    }

}

@Preview
@Composable
private fun ItemChatPreview() {
    ItemChat(
        user = User(
            name = "John Doe",
            message = "Hello, how are you?",
            time = "10:00",
            image = R.drawable.user
        )
    )
}