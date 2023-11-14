package com.rogoz208.cryptosomething

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.rogoz208.cryptosomething.ui.theme.CryptoSomethingTheme

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