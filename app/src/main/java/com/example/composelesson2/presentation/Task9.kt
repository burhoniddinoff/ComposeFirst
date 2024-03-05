package com.example.composelesson2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelesson2.R

@Composable
fun Task9() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(3f)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_note_3),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Row(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 16.dp, end = 16.dp)
            ) {

                Text(
                    text = "Share",
                    color = Color(0xFFb3b2ae),
                    modifier = Modifier
                        .padding(end = 12.dp)
                        .border(1.dp, color = Color(0xFFb3b2ae))
                        .padding(12.dp),
                    fontSize = 24.sp
                )

                Text(
                    text = "Done",
                    color = Color(0xFFb3b2ae),
                    modifier = Modifier
                        .border(1.dp, color = Color(0xFFb3b2ae))
                        .padding(12.dp),
                    fontSize = 24.sp
                )

            }

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
            ) {
                Text(
                    text = "Freelancer",
                    fontSize = 42.sp,
                    modifier = Modifier
                        .padding(start = 24.dp)
                )
                Text(
                    text = "Create: Jul 08, 2013 | Edited: sec ago",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 24.dp, top = 6.dp)
                )
            }

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF00c2d9))
        ) {

            Text(
                text = "The Idea",
                color = Color.White,
                fontSize = 23.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 24.dp)
                    .size(36.dp)
            )

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF01d48f))
        ) {
            Text(
                text = "The Market",
                color = Color.White,
                fontSize = 23.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 24.dp)
                    .size(36.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF008984))
        ) {
            Text(
                text = "The Product",
                color = Color.White,
                fontSize = 23.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 24.dp)
                    .size(36.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFf3c300))
        ) {
            Text(
                text = "Business Model",
                color = Color.White,
                fontSize = 23.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 24.dp)
                    .size(36.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFde6e00))
        ) {
            Text(
                text = "Execution",
                color = Color.White,
                fontSize = 23.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 24.dp)
                    .size(36.dp)
            )
        }

    }

}

@Preview
@Composable
private fun PrevTask9() {
    MaterialTheme {
        Task9()
    }
}