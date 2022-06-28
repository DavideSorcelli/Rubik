package it.dsorcelli.rubik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import it.dsorcelli.rubik.ui.navigation.NavRoutes
import it.dsorcelli.rubik.ui.stats.StatsScreen
import it.dsorcelli.rubik.ui.theme.RubikTheme
import it.dsorcelli.rubik.ui.timer.TimerScreen
import it.dsorcelli.rubik.ui.timer.TimerVM

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RubikTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = NavRoutes.Timer.route
                    ) {
                        composable(NavRoutes.Timer.route) { backStackEntry ->
                            val parentEntry = remember(backStackEntry) {
                                navController.getBackStackEntry(route = NavRoutes.Timer.route)
                            }
                            val parentVM = hiltViewModel<TimerVM>(viewModelStoreOwner = parentEntry)
                            TimerScreen(
                                navController = navController,
                                viewModel = parentVM
                            )
                        }
                        composable(NavRoutes.Stats.route) { backStackEntry ->
                            val parentEntry = remember(backStackEntry) {
                                navController.getBackStackEntry(route = NavRoutes.Timer.route)
                            }
                            val parentVM = hiltViewModel<TimerVM>(viewModelStoreOwner = parentEntry)
                            StatsScreen(
                                navController = navController,
                                viewModel = parentVM
                            )
                        }
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RubikTheme {
        TimerScreen(navController = rememberNavController())
    }
}