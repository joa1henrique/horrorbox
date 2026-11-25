package com.horrorbox

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.fragment.app.FragmentActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.horrorbox.ui.screens.DetailScreen
import com.horrorbox.ui.screens.HomeScreen
import com.horrorbox.ui.screens.WatchlistScreen
import com.horrorbox.ui.theme.HorrorboxTheme

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HorrorboxTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "home") {
                        composable("home") {
                            HomeScreen(
                                onNavigateToDetail = { navController.navigate("detail") },
                                onNavigateToWatchlist = { navController.navigate("watchlist") }
                            )
                        }
                        composable("detail") {
                            DetailScreen(
                                onBackClick = { navController.popBackStack() }
                            )
                        }
                        composable("watchlist") {
                            WatchlistScreen(
                                onNavigateBack = { navController.popBackStack() }
                            )
                        }
                    }
                }
            }
        }
    }
}
