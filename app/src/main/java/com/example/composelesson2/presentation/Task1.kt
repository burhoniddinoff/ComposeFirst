package com.example.composelesson2.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelesson2.R

/*

max = 343

1 -> 20
2 -> 52
3 -> 160
4 -> 52
5 -> 52

 */

@Composable
fun MyTask1() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        // 1st Linear
        Row(
            modifier = Modifier
                .weight(0.08f)
                .fillMaxWidth()
                .background(Color(0xFF8AA791))
        ) {
            // Content of the first linear layout
        }

        // 2nd Linear
        Row(
            modifier = Modifier
                .weight(0.14f)
                .fillMaxWidth()
                .background(Color(0xFFe3ba89))
        ) {

            Spacer(modifier = Modifier.weight(4f))

            Column(
                modifier = Modifier.weight(3f)
            ) {
                Text(
                    text = "MORNING",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color.White,
                    fontSize = 28.sp,
                )
                Text(
                    text = "- 1°",
                    color = Color.White,
                    fontSize = 52.sp
                )
            }
        }

        // 3rd Linear
        Row(
            modifier = Modifier
                .fillMaxHeight(0.50f)
                .fillMaxWidth()
                .background(Color(0xFFd79863))
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_weather_icon),
                contentDescription = "Weather image",
                modifier = Modifier
                    .size(212.dp)
                    .padding(14.dp)
            )

//                    Spacer(modifier = Modifier.weight(4f))

            Column(
                modifier = Modifier
                    .padding(
                        top = 16.dp,
                        start = 14.dp
                    )
                    .weight(3f)

            ) {

                Text(
                    text = "DAY",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color.White,
                    fontSize = 28.sp,
                )

                Text(
                    text = "+ 3°",
                    color = Color.White,
                    fontSize = 52.sp
                )

                Text(
                    text = "Mostly \nSunny",
                    modifier = Modifier.padding(top = 20.dp),
                    color = Color.White,
                    fontSize = 36.sp,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )

                Text(
                    text = "Wind: N5 mph\nHumidity: 45%",
                    modifier = Modifier.padding(top = 20.dp),
                    color = Color.White,
                    fontSize = 22.sp,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )

            }

        }

        // 4th Linear
        Row(
            modifier = Modifier
                .weight(0.14f)
                .fillMaxWidth()
                .background(Color(0xFFb1695b))
        ) {

            Spacer(modifier = Modifier.weight(4f))

            Column(
                modifier = Modifier.weight(3f)
            ) {

                Text(
                    text = "Evening",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color.White,
                    fontSize = 28.sp
                )

                Text(
                    text = "0°",
                    color = Color.White,
                    fontSize = 52.sp
                )

            }

        }

        // 5th Linear
        Row(
            modifier = Modifier
                .weight(0.14f)
                .fillMaxWidth()
                .background(color = Color(0xFF644749))
        ) {

            Spacer(modifier = Modifier.weight(4f))

            Column(
                modifier = Modifier.weight(3f)
            ) {

                Text(
                    text = "NIGHT",
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color.White,
                    fontSize = 28.sp
                )

                Text(
                    text = "- 2°",
                    color = Color.White,
                    fontSize = 52.sp
                )

            }
        }
    }
}

