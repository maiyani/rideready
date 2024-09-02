package com.example.rideready.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rideready.ui.theme.screens.car.CarScreen
import com.example.rideready.ui.theme.screens.cars.AddCarScreen
import com.example.rideready.ui.theme.screens.cars.ViewCarScreen
import com.example.rideready.ui.theme.screens.cars.ViewCarsScreen
import com.example.rideready.ui.theme.screens.checkout.CheckOutScreen
import com.example.rideready.ui.theme.screens.home.HomeScreen
import com.example.rideready.ui.theme.screens.login.LoginScreen
import com.example.rideready.ui.theme.screens.signup.SignupScreen
import com.example.rideready.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }


        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }


        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }


        composable(ADD_CAR_URL) {
            AddCarScreen(navController = navController)
        }
        composable(VIEW_CARS_URL) {
           ViewCarsScreen(navController = navController)
        }

        composable(VIEW_CAR_URL) {
            ViewCarScreen(navController = navController)
        }

        composable(ROUT_CHECKOUT) {
           CheckOutScreen(navController= navController)
        }

        composable(ROUT_CAR) {
            CarScreen(navController= navController)
        }



    }
}