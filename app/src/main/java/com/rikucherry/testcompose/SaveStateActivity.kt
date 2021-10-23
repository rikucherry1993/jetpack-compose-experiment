package com.rikucherry.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class SaveStateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                val colorState1 = remember {
                    mutableStateOf(Color.Blue)
                }

                val colorState2 = remember {
                    mutableStateOf(Color.Yellow)
                }

                val colorState3 = remember {
                    mutableStateOf(Color.Red)
                }

                val colorState4 = remember {
                    mutableStateOf(Color.Green)
                }

                Row(modifier = Modifier.weight(1f).fillMaxSize()) {
                    ColorBox(modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorState1.value)
                    ){
                        colorState1.value = it
                    }


                    ColorBox(modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorState2.value)
                    ){
                        colorState2.value = it
                    }
                }

                Row(modifier = Modifier.weight(1f).fillMaxSize()) {
                    ColorBox(modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorState3.value)
                    ){
                        colorState3.value = it
                    }


                    ColorBox(modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(colorState4.value)
                    ){
                        colorState4.value = it
                    }
                }



            }

        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )

            )
        }
    )

}