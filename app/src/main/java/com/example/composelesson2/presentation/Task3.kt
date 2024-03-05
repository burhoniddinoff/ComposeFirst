package com.example.composelesson2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelesson2.R

@Composable
fun Task3() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(
                    color = Color(0xFF0670ba),
                )
        ) {
            Text(
                text = "Buy Local",
                fontSize = 23.sp,
                color = Color.White,
                modifier = Modifier.align(alignment = Alignment.Center)
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.Black)
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(color = Color.White)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xFF89c00d))
                    ) {

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(64.dp)
                        )

                        Text(
                            text = "  Local \nBusiness",
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ic_location),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                                .padding(top = 6.dp)
                                .align(Alignment.CenterHorizontally)
                        )

                    }

                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xFF489988))
                    ) {

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp)
                        )

                        Text(
                            text = "Games",
                            color = Color.White,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ic_game),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                                .padding(top = 6.dp)
                                .align(Alignment.CenterHorizontally)
                        )

                    }

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(color = Color.Black)
                ) {


                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xFF711eae))
                    ) {


                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.ic_shop),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(64.dp)
                                    .padding(bottom = 6.dp)
                                    .align(Alignment.CenterHorizontally)
                            )

                            Text(
                                text = "Storefront",
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                            )



                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )

                        }

                    }

                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .background(Color(0xFFc9b200))
                    ) {

                        Column(
                            modifier = Modifier.align(
                                Alignment
                                    .BottomCenter
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_tag),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(64.dp)
                                    .padding(bottom = 6.dp)
                                    .align(Alignment.CenterHorizontally)
                            )

                            Text(
                                text = "Deals",
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                            )

                            Spacer(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                        }

                    }

                }


            }

            Image(
                painter = painterResource(id = R.drawable.ic_earth_map),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(240.dp)
                    .clip(CircleShape)
                    .border(8.dp, Color.White, CircleShape)
            )
        }



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(
                    color = Color(0xFF0670ba),
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "",
                modifier = Modifier
                    .height(36.dp)
                    .align(Alignment.Center)
            )
        }


    }

}


@Preview
@Composable
private fun PrevTask3() {
    MaterialTheme {
        Task3()
    }
}