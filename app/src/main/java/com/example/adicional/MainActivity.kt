package com.example.adicional

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.adicional.ui.theme.AdicionalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdicionalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TaskCompletionScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompletionScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 1. Imagen redonda con el ícono de check
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed), // Asegúrate de tener el ícono en res/drawable
            contentDescription = "Check icon",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape) // Esto hace que la imagen sea redonda
        )

        Spacer(modifier = Modifier.height(20.dp))

        // 2. Título (All tasks completed)
        Text(
            text = "All tasks completed",
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            ),
            modifier = Modifier.padding(bottom = 8.dp),
            color = Color.Black
        )

        // 3. Subtítulo (Nice work!)
        Text(
            text = "Nice work!",
            style = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 16.sp
            ),
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletionScreenPreview() {
    AdicionalTheme {
        TaskCompletionScreen()
    }
}
