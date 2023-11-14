package com.rogoz208.cryptosomething.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.rogoz208.cryptosomething.presentation.ui.theme.CryptoSomethingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoSomethingTheme {
                Surface(color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}