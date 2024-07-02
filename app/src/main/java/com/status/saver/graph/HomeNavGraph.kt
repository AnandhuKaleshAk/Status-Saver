package com.status.saver.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.status.saver.BottomBarScreen
import com.status.saver.screens.home.ImagesScreen
import com.status.saver.screens.home.SavesScreen
import com.status.saver.screens.home.SettingsScreen
import com.status.saver.screens.home.VideoScreen

@Composable
fun  HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Images.route
    ){

        composable(route = BottomBarScreen.Images.route){
            ImagesScreen()
        }


        composable(route = BottomBarScreen.Videos.route){
            VideoScreen()
        }

        composable(route = BottomBarScreen.Saved.route){
            SavesScreen()
        }

        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen()
        }


    }

}