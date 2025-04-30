package com.example.shepsofdmi_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shepsofdmi_app.ui.theme.ShepSofDmi_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShepSofDmi_AppTheme {
                CounterApp()
            }
        }
    }
}

@Composable
fun CounterApp() {
    var count by remember { mutableIntStateOf(5) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = count.toString(),
            onValueChange = { },
            readOnly = true,
            textStyle = LocalTextStyle.current.copy(
                fontSize = 48.sp,
                textAlign = TextAlign.Center
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .padding(bottom = 32.dp)
                .width(100.dp)
        )
        Button(
            onClick = {
                count = if (count > 0) count - 1 else 5
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .background(Color.Black, shape = RoundedCornerShape(12.dp))
        ) {
            Text(
                text = "Уменьшить",
                fontSize = 20.sp
            )
        }
    }
}