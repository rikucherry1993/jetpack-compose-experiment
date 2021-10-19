package com.rikucherry.testcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rikucherry.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //note：lambda表达式作为第二参数 写在括号外面
        //note：Unit相当于java的void
        setContent() {
            //note:Modifier适用于任何Composable
            //note:Modifier内部参数是顺次执行的，顺序会影响效果
            Column(
                Modifier
                    .background(Color.Yellow)
                    .width(200.dp)
                    .height(300.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Row1211111",
                    modifier = Modifier.clickable {
                        Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
                    })
                Text(text = "Row2")
                Text(text = "Row3")
                Text(text = "Row456")
                Button(
                    enabled = true,
                    onClick = {
                        intent = Intent(this@MainActivity, CardActivity::class.java)
                        startActivity(intent)
                    }) {
                    Text(text = "Card Activity",
                        modifier = Modifier.padding(5.dp),
                        fontSize = 20.sp
                        )
                }
            }
        }
    }
}