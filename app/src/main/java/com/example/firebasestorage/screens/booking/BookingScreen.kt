package com.example.firebasestorage.screens.booking

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_HOTEL

@OptIn(ExperimentalMaterial3Api::class)
@Composable
    fun BookingScreen(navController: NavController){
        Column(modifier = Modifier.fillMaxSize()) {
            val mContext = LocalContext.current
            Column(modifier = Modifier.fillMaxSize()) {

                //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
                TopAppBar(
                    title = { },
                    colors = TopAppBarDefaults.largeTopAppBarColors(Color.White),
                    navigationIcon = {
                        IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_HOTEL) }) {

                            Icon(Icons.Filled.ArrowBack, null)
                        }
                    }, actions = {
                        IconButton(onClick = {/* Do Something*/ }) {
                            Icon(Icons.Filled.Search, null)
                        }
                    })
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Book Now",
                modifier = Modifier.padding(20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold, color = Color.Black,
                fontFamily = FontFamily.SansSerif
                )



            }
        }
        
    }
    

@Preview(showBackground = true)
@Composable
    fun BookingPreview(){
        BookingScreen(rememberNavController())
    }
