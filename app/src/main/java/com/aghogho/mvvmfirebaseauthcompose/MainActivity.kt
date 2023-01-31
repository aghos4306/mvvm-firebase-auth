package com.aghogho.mvvmfirebaseauthcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.aghogho.mvvmfirebaseauthcompose.navigation.AppNavHost
import com.aghogho.mvvmfirebaseauthcompose.ui.theme.AppTheme
import com.aghogho.mvvmfirebaseauthcompose.ui.theme.MVVMFirebaseAuthComposeTheme
import com.aghogho.mvvmfirebaseauthcompose.ui.viewmodel.AuthViewModel

class MainActivity : ComponentActivity() {

    private val authViewModel by viewModels<AuthViewModel>()

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("RememberReturnType", "UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val snackbarHostState = remember { SnackbarHostState() }
            Scaffold(
                snackbarHost = { SnackbarHost(snackbarHostState) },
                content = {
                    AppTheme {
                        AppNavHost()
                    }
                }
            )
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MVVMFirebaseAuthComposeTheme {
        Greeting("Android")
    }
}
