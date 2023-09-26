package com.example.firebasestorage.navigation

import android.provider.ContactsContract.Intents.Insert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.screens.cities.CitiesScreen
import com.example.firebasestorage.screens.cities2.Cities2Screen
import com.example.firebasestorage.screens.cities3.Cities3Screen
import com.example.firebasestorage.screens.cities4.Cities4Screen
import com.example.firebasestorage.screens.cities5.Cities5Screen
import com.example.firebasestorage.screens.cities6.Cities6Screen
import com.example.firebasestorage.screens.contact.ContactScreen
import com.example.firebasestorage.screens.destinations.DestinationScreen
import com.example.firebasestorage.screens.explore2cities.Explore2Screen
import com.example.firebasestorage.screens.explore3.Explore3Screen
import com.example.firebasestorage.screens.explore4.Explore4Screen
import com.example.firebasestorage.screens.explore5.Explore5Screen
import com.example.firebasestorage.screens.explore6.Explore6Screen
import com.example.firebasestorage.screens.explorecities.ExploreScreen
import com.example.firebasestorage.screens.home.HomeScreen
import com.example.firebasestorage.screens.hotels.HotelScreen
import com.example.firebasestorage.screens.hotels2.HotelS2creen
import com.example.firebasestorage.screens.hotels3.HotelS3creen
import com.example.firebasestorage.screens.hotels4.Hotel4Screen
import com.example.firebasestorage.screens.hotels5.HotelS5creen
import com.example.firebasestorage.screens.hotels6.HotelS6creen
import com.example.firebasestorage.screens.login.LoginScreen
import com.example.firebasestorage.screens.museum.MuseumScreen
import com.example.firebasestorage.screens.museum2.Museum2Screen
import com.example.firebasestorage.screens.museum3.Museum3Screen
import com.example.firebasestorage.screens.museum4.Museum4Screen
import com.example.firebasestorage.screens.museum5.Museum5Screen
import com.example.firebasestorage.screens.museum6.Museum6Screen
import com.example.firebasestorage.screens.signup.SignupScreen
import com.example.firebasestorage.screens.upload.UploadScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }
        composable(ROUT_CONTACT){
            ContactScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }
        composable(ROUT_DESTINATION){
            DestinationScreen(navController)
        }
        composable(ROUT_CITIES){
            CitiesScreen(navController)
        }
        composable(ROUT_EXPLORECITIES){
            ExploreScreen(navController)
        }

        composable(ROUT_MUSEUM) {
            MuseumScreen(navController)
        }
        composable(ROUT_CITIES2){
            Cities2Screen(navController)
        }
        composable(ROUT_EXPLORE2){
            Explore2Screen(navController)
        }
        composable(ROUT_MUSEUM2){
            Museum2Screen(navController)
        }
        composable(ROUT_CITIES3){
            Cities3Screen(navController)
        }
        composable(ROUT_EXPLORE3){
            Explore3Screen(navController)
        }
        composable(ROUT_HOTEL3){
            HotelS3creen(navController )
        }
        composable(ROUT_MUSEUM3){
            Museum3Screen(navController)
        }
        composable(ROUT_CITIES4){
            Cities4Screen(navController)
        }
        composable(ROUT_EXPLORE4){
            Explore4Screen(navController)
        }
        composable(ROUT_HOTEL4){
            Hotel4Screen(navController)
        }
        composable(ROUT_MUSEUM4){
            Museum4Screen(navController)
        }
        composable(ROUT_CITIES5){
            Cities5Screen(navController)
        }
        composable(ROUT_HOTEL5){
            HotelS5creen(navController)
        }
        composable(ROUT_EXPLORE5){
            Explore5Screen(navController)
        }
        composable(ROUT_MUSEUM5){
            Museum5Screen(navController)
        }
        composable(ROUT_CITIES6){
            Cities6Screen(navController)
        }
        composable(ROUT_EXPLORE6){
            Explore6Screen(navController)
        }
        composable(ROUT_HOTEL6){
            HotelS6creen(navController)
        }
        composable(ROUT_MUSEUM6){
            Museum6Screen(navController)
        }
        composable(ROUT_HOTEL){
            HotelScreen(navController)
        }
        composable(ROUT_HOTEL2){
            HotelS2creen(navController)
        }







    }
}