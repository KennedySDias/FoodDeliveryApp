package br.com.fooddeliveryapp.features.home.pub

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

interface HomeNavHost {
    @Composable
    fun OpenHomeNavHost(navController: NavHostController)
}