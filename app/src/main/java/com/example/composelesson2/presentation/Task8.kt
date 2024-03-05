package com.example.composelesson2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelesson2.R
import com.example.composelesson2.ui.theme.ComposeLesson2Theme

data class Task8Data(
    val img1: Int,
    val text1: String,
    val text2: String,
    val img2: Int,
    val bgColor: Long,
)

val ls = arrayOf(
    Task8Data(R.drawable.person1, "Deborah Kim", "158 followers", R.drawable.ic_add, 0xffff8e22),
    Task8Data(R.drawable.person2, "Catherine Murphy", "no followers", R.drawable.ic_add, 0xffff5037),
    Task8Data(R.drawable.person3, "Dirk Riese", "42 followers", R.drawable.ic_add, 0xfffc315b),
    Task8Data(R.drawable.person4, "Danielle Jones", "2387 followers", R.drawable.ic_add, 0xffa63065),
    Task8Data(R.drawable.person5, "Deborah Kim", "69 followers", R.drawable.ic_add, 0xff4d2e39),
    Task8Data(R.drawable.person1, "Deborah Kim", "158 followers", R.drawable.ic_add, 0xffff8e22),
    Task8Data(R.drawable.person2, "Catherine Murphy", "no followers", R.drawable.ic_add, 0xffff5037),
    Task8Data(R.drawable.person3, "Dirk Riese", "42 followers", R.drawable.ic_add, 0xfffc315b),
    Task8Data(R.drawable.person4, "Danielle Jones", "2387 followers", R.drawable.ic_add, 0xffa63065),
    Task8Data(R.drawable.person5, "Deborah Kim", "69 followers", R.drawable.ic_add, 0xff4d2e39),
    Task8Data(R.drawable.person1, "Deborah Kim", "158 followers", R.drawable.ic_add, 0xffff8e22),
    Task8Data(R.drawable.person2, "Catherine Murphy", "no followers", R.drawable.ic_add, 0xffff5037),
    Task8Data(R.drawable.person3, "Dirk Riese", "42 followers", R.drawable.ic_add, 0xfffc315b),
    Task8Data(R.drawable.person4, "Danielle Jones", "2387 followers", R.drawable.ic_add, 0xffa63065),
    Task8Data(R.drawable.person5, "Deborah Kim", "69 followers", R.drawable.ic_add, 0xff4d2e39),

    )

@Composable
fun Task8() {

    LazyColumn {
        for (i in ls.indices) {
            item {
                Item(data = ls[i])
            }
        }
    }

}

@Composable
fun Item(data: Task8Data) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = Color(data.bgColor))
            .padding(start = 20.dp, end = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = data.img1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .border(
                    width = 2.dp, color = Color.White,
                    shape = CircleShape
                )
                .padding(4.dp)
                .align(Alignment.CenterVertically)
                .clip(CircleShape)

        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .padding(start = 12.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = data.text1,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = data.text2,
                color = Color(0x80FFFFFF),
                fontSize = 12.sp
            )
        }

        Image(
            painter = painterResource(id = data.img2),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .size(28.dp)
        )

    }
}


@Preview
@Composable
fun PreviewTask() {
    ComposeLesson2Theme {
        Task8()
    }
}