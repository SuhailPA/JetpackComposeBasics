package com.example.birthdaycardwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.birthdaycardwithcompose.ui.theme.BirthdayCardWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingForBirthdayCard("Android")
                }
            }
        }
    }
}

@Composable
fun GreetingForBirthdayCard(message : String){

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardWithComposeTheme {
        GreetingForBirthdayCard("Suhail")
    }
}