package com.example.composecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecard.ui.theme.ComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeCard()
                }
            }
        }
    }
}

@Composable
fun ComposeCard() {
    Column {
        Row {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color.Green)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .weight(1f)
                    .height(400.dp)


            ) {
                Text(
                    text = "Text Composable",
                    modifier = Modifier.padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Displays text and follows Material Design guidelines.",
                    textAlign = TextAlign.Justify,
                )

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color.Yellow)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .weight(1f)
                    .height(400.dp)


            ) {
                Text(
                    text = "Image Composable",
                    modifier = Modifier
                        .padding(bottom = 16.dp),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "Creates a composable that lays out and draws a given painter class object.",
                    textAlign = TextAlign.Justify
                )
            }

        }
        Row {                                 //row 2
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .weight(1f)
                    .height(400.dp)

            ) {
                Text(
                    text = "Row Composable",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)

                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .weight(1f)
                    .height(400.dp)

            ) {
                Text(
                    text = "Column Composable",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeCardPreview() {
    ComposeCardTheme {
        ComposeCard()
    }
}