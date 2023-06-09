package br.com.fooddeliveryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import br.com.fooddeliveryapp.features.home.impl.navigation.HomeNavHostImpl
import br.com.fooddeliveryapp.ui.theme.FoodDeliveryAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FoodDeliveryAppTheme {
                HomeNavHostImpl().OpenHomeNavHost(navController = navController)
            }
        }
    }
}
