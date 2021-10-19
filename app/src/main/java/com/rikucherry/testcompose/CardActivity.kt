package com.rikucherry.testcompose

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

class CardActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                ImageCard(
                    //for getting resources
                    painter = painterResource(id = R.drawable.snoopy),
                    description = "Snoopy on the roof",
                    title = "Snoopy Card"
                )

                ImageCard(
                    //for getting resources
                    modifier = Modifier.fillMaxWidth(0.5f),
                    painter = painterResource(id = R.drawable.snoopy),
                    description = "Snoopy on the roof",
                    title = "Snoopy Card"
                )

                ImageCard(
                    //for getting resources
                    painter = painterResource(id = R.drawable.snoopy),
                    description = "Snoopy on the roof",
                    title = "Snoopy Card"
                )
            }


        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    description: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier.padding(12.dp, 8.dp)) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            //stack contents
            Box(modifier = Modifier.height(200.dp)) {
                //First in Last out
                Image(
                    painter = painter,
                    contentDescription = description,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 300f
                            )
                        )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Row() {
                        Text(
                            title,
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 16.sp
                            )
                        )

                        Image(
                            alignment = Alignment.BottomEnd,
                            painter = painterResource(
                            id = R.drawable.ic_baseline_favorite_border_24
                        ), contentDescription = null)
                    }

                }
            }
        }


    }
}