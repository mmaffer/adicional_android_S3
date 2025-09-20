package com.example.adicional

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    JetpackComposeTutorial(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackComposeTutorial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 1. Banner con altura fija
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background), // pon banner.png en res/drawable
            contentDescription = "Banner",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp) // altura fija para que se vea como en tu imagen
        )

        // Contenido de texto con padding lateral
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {

            // 2. Título
            Text(
                text = "Jetpack Compose tutorial",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // 3. Subtítulo
            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                        "Compose simplifies and accelerates UI development on Android with less code, " +
                        "powerful tools, and intuitive Kotlin APIs.",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 16.sp,
                lineHeight = 22.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // 4. Cuerpo
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose compiler does the rest. " +
                        "Compose is built around Composable functions. These functions let you define your app’s UI " +
                        "programmatically because they let you describe how it should look and provide data dependencies, " +
                        "rather than focus on the process of the UI’s construction, such as initializing an element and " +
                        "then attaching it to a parent. To create a Composable function, you add the @Composable annotation " +
                        "to the function name.",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 14.sp,
                lineHeight = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetpackComposeTutorialPreview() {
    AdicionalTheme {
        JetpackComposeTutorial()
    }
}
