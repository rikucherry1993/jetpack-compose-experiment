package com.rikucherry.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.rikucherry.testcompose.ui.theme.TestComposeTheme

class StylingText : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.gluten_black, FontWeight.Black),
            Font(R.font.gluten_bold, FontWeight.Bold),
            Font(R.font.gluten_extra_bold, FontWeight.ExtraBold),
            Font(R.font.gluten_extra_light, FontWeight.ExtraLight),
            Font(R.font.gluten_light, FontWeight.Light),
            Font(R.font.gluten_medium, FontWeight.Medium),
            Font(R.font.gluten_regular, FontWeight.Normal),
            Font(R.font.gluten_semi_bold, FontWeight.SemiBold),
            Font(R.font.gluten_thin, FontWeight.Thin),
        )

        setContent {
            TestComposeTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    fontSize = 50.sp,
                                    color = Color.Green,
                                    textDecoration = TextDecoration.None
                                )
                            ) {
                                append("C")
                            }
                            append("ool")

                            withStyle(
                                SpanStyle(
                                    fontSize = 50.sp,
                                    color = Color.Green,
                                    textDecoration = TextDecoration.None
                                )
                            ) {
                                append("S")
                            }
                            append("tyling")
                        },
                        modifier = Modifier.align(Alignment.Center),
                        fontSize = 30.sp,
                        fontFamily = fontFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.None
                    )
                }
            }
        }
    }
}