package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){
                    Column () {


                        TextComponent(value = "hey there dany",22.sp , Color.Green,
                            FontFamily.Monospace, FontWeight.Bold, TextAlign.Center
                        )
                        TextComponent(value = "please register here",22.sp , Color.Green,
                            FontFamily.Monospace, FontWeight.Bold, TextAlign.Center
                        )
                    }



                }




            }
        }
    }
}


@Composable
fun TextComponent(
    value: String,
    size: TextUnit,
    color: Color,
    family: FontFamily,
    fontWeightValue: FontWeight,
    textAlignValue: TextAlign
){
    Text(modifier = Modifier.background(Color.Black)
                            .padding(18.dp)
                            .wrapContentHeight(),


        text = value,
        fontSize = 23.sp,
        color = androidx.compose.ui.graphics.Color.Red,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Light,
        textAlign = TextAlign.Center,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HelloClientPreview() {
    Column {

        TextComponent(value = "hey there dany",22.sp , Color.Green,
            FontFamily.Monospace, FontWeight.Bold, TextAlign.Center
        )
        TextComponent(value = "please register here",22.sp , Color.Green,
            FontFamily.Monospace, FontWeight.Bold, TextAlign.Center
        )
    }
}