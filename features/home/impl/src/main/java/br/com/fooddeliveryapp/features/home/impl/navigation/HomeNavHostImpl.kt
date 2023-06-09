package br.com.fooddeliveryapp.features.home.impl.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fooddeliveryapp.features.home.impl.presentation.screen.HomeScreen
import br.com.fooddeliveryapp.features.home.pub.HomeNavHost

class HomeNavHostImpl : HomeNavHost {

    @Composable
    override fun OpenHomeNavHost(navController: NavHostController) {
        return NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen() }
        }
    }
}