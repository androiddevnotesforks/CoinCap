package com.client.search.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.client.search.SearchRoute

const val searchNavigationRoute = "route_route"

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    this.navigate(searchNavigationRoute, navOptions)
}

fun NavGraphBuilder.searchScreen(navController: NavHostController) {
    composable(route = searchNavigationRoute) {
        SearchRoute(navController = navController)
    }
}