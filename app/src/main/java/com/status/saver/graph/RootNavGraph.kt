package com.status.saver.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.status.saver.screens.home.HomeScreen
import com.status.saver.screens.SplashScreen

@Composable
fun  RootNavGraph(navHostController: NavHostController){
    NavHost(navController = navHostController, route = Graph.ROOT, startDestination =Screens.Splash.route){

        composable(
            route = Screens.Splash.route
        ){
            SplashScreen()

        }
        composable(route = Graph.HOME){
           HomeScreen()
        }
    }
    
}
object Graph{
    const val ROOT="root_graph"
    const val HOME="home_graph"
}

sealed class Screens(val route: String) {
    data object Splash : Screens(route = "splash")

}