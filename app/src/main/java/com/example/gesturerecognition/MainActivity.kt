package com.example.gesturerecognition

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    ScrollModifiers(modifier)
}

@Composable
fun ScrollModifiers(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(200.dp)
            .verticalScroll(rememberScrollState())
            .horizontalScroll(rememberScrollState())
            .background(Color.LightGray)
    ) {
        Image(
            painter = painterResource(id = R.drawable.vacation),
            contentDescription = null,
            modifier = Modifier.size(360.dp, 270.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
