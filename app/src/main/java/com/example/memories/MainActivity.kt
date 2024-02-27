package com.example.memories

import android.graphics.fonts.Font
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.memories.ui.theme.MemoriesTheme
import androidx.compose.material3.Text as Text1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MemoriesTheme {
                // Login Screen
                // LoginScreen()
                Text1(
                    text = "Hello", style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text1(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MemoriesTheme {
        Greeting(message = "Begone thot")
    }
}

@Composable
fun Greeting(message: String) {
    Box(
        modifier = Modifier.paint(painter = painterResource(id = R.mipmap.random))
    ) {
        Text1(
            text = message,
            fontSize = 34.sp,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium,
            color = Color.White

        )
    }
}


@Composable
fun PreviewGreeting() {
    MemoriesTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(15.dp)
        )
        Greeting(message = "Test Message")
    }
}

@Preview
@Composable
fun LayoutDemo() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth()
            .height(200.dp)
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            // horizontalArrangement = Arrangement.Center
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello",
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .padding(top = 6.dp, bottom = 6.dp)
                    .background(Color.White)
                    .clip(RoundedCornerShape(8.dp)),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                text = "SHYAM",
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                text = "RAM",
                modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Login",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.headlineSmall
                )
            }, colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        )
    }) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(text = "Welcome 2 da app", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "Please provide your valid credentials",
                style = MaterialTheme.typography.titleLarge
            )
            TextField(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
                value = "someone@gmail.com",
                onValueChange = {})
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                value = "password",
                onValueChange = {},
                visualTransformation = VisualTransformation.None
            )

            Button(modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .heightIn(min = 52.dp),
                onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }

            Row(
                modifier = Modifier.padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = true, onCheckedChange = {})
                Text(text = "Remember me.")
            }

            Text(
                modifier = Modifier.align(Alignment.End),
                text = buildAnnotatedString {
                    append("If new user")
                withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.primary
                , textDecoration = TextDecoration.Underline)) {
                    append(" register ")
                }
                append(" here.")
            })
        }

    }
}

@Preview
@Composable
fun PreviewLoginScreen() {
    MemoriesTheme {
        LoginScreen()
    }
}
