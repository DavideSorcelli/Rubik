package it.dsorcelli.rubik.ui.navigation

sealed class NavRoutes(val route: String) {
    object Timer : NavRoutes("timer")
    object Stats : NavRoutes("stats")
}