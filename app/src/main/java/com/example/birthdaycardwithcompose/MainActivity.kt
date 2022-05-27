package com.example.birthdaycardwithcompose

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    GreetingForBirthdayCardWithImage("Android","Suhail")
                }
            }
        }
    }
}

@Composable
fun GreetingForBirthdayCardWithImage(message: String, from : String){
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(painter = image, contentDescription = null,
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        contentScale = ContentScale.Crop)
        GreetingForBirthdayCard(message = message, from = from)
    }


}

@Composable
fun GreetingForBirthdayCard(message : String , from : String){
    Column {
        Text(text = message, modifier = Modifier.padding(5.dp))
        Text(text = from)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardWithComposeTheme {
        GreetingForBirthdayCardWithImage("Happy Birthday!!!","Suhail P A")
    }
}