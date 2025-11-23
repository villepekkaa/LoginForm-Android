package com.example.loginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginform.ui.theme.LoginFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginFormTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginForm(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LoginForm(modifier: Modifier = Modifier) {
    val appModifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
    Column(
        modifier = modifier
    ) {
        Text(
            modifier = appModifier.fillMaxWidth(),
            text = "Login",
            style = MaterialTheme.typography.titleLarge.copy(fontSize = 28.sp),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
        OutlinedTextField(
            modifier = appModifier,
            label = { Text("Username") },
            value = "",
            onValueChange = { /*TODO*/ }
        )
        OutlinedTextField(
            modifier = appModifier,
            label = { Text("Password") },
            value = "",
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                onValueChange = { /*TODO*/ }
            )
        Button(
            modifier = appModifier,
            onClick = {/*TODO*/ }
        ) {
            Text("Submit")
        }
    }
}
