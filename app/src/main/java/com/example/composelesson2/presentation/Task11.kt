package com.example.composelesson2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelesson2.R

@Composable
fun Task11() {

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp


    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .background(Color(0xFF08cae3))
        ) {
            Image(
                painter = painterResource(id = R.drawable.person6),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .size(128.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = "William Snoe",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 12.dp)
            )
        }


        val paddingTop = 72.dp // rasm va info line orasidagi masofa
        val paddingBottom = 100.dp // rasm va screen pastki orasidagi masofa
        Box(modifier = Modifier.weight(3f)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(screenHeight * 3 / 5)
                    .padding(top = paddingTop, bottom = paddingBottom)
            ) {

                // mana shu joyga center elementlarinin qo'shing


            }

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 16.dp, end = 48.dp)
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.ic_email),
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                    )

                    Text(
                        text = "+222 202 202",
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_phone),
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                    )
                    Text(text = "+222 202 202", modifier = Modifier.padding(start = 16.dp))
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(top = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_group_add),
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                    )
                    Text(text = "+222 202 202", modifier = Modifier.padding(start = 16.dp))
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_message),
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                    )
                    Text(
                        text = "+222 202 202",
                        modifier = Modifier
                            .padding(start = 16.dp)
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 16.dp),
                    colors = ButtonDefaults
                        .buttonColors(containerColor = Color(0xFF09C4DD))
                ) {
                    Text(text = "FOLLOW ME", color = Color.White)

                }
            }
        }
    }

    Box(
        modifier = Modifier
            .padding(
                start = 16.dp,
                end = 16.dp,
                top = screenHeight * 2 / 5 - 50.dp,
                bottom = screenHeight * 3 / 5 - 50.dp
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .shadow(
                    elevation = 8.dp,
                    spotColor = Color.Black,
                    shape = RoundedCornerShape(12.dp)
                )
                .background(Color.White, RoundedCornerShape(12.dp))
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Photos",
                    fontSize = 12.sp,
                    color = Color(0xFF858080)
                )

                Text(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .align(Alignment.CenterHorizontally),
                    text = "376",
                    fontWeight = FontWeight.W500,
                    fontSize = 28.sp,
                    color = Color(0xFF32B3ED)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Followers",
                    fontSize = 12.sp,
                    color = Color(0xFF858080)
                )

                Text(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .align(Alignment.CenterHorizontally),
                    text = "1769",
                    fontWeight = FontWeight.W500,
                    fontSize = 28.sp,
                    color = Color(0xFF858080)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Following",
                    fontSize = 12.sp,
                    color = Color(0xFF858080)
                )
                Text(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .align(Alignment.CenterHorizontally),
                    text = "127",
                    fontWeight = FontWeight.W500,
                    fontSize = 28.sp,
                    color = Color(0xFF858080)
                )
            }

        }
    }

    //

}