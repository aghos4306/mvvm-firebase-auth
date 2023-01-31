package com.aghogho.mvvmfirebaseauthcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aghogho.mvvmfirebaseauthcompose.ui.auth.LoginScreen
import com.aghogho.mvvmfirebaseauthcompose.ui.auth.SignupScreen
import com.aghogho.mvvmfirebaseauthcompose.ui.home.HomeScreen
import com.aghogho.mvvmfirebaseauthcompose.ui.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
    }
}
