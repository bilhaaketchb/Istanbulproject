package com.example.firebasestorage.screens.home

import android.app.Notification.Action
import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.GenericFontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_DESTINATION
import com.example.firebasestorage.navigation.ROUT_HOME
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_SIGNUP) }) {
                    androidx.compose.material3.Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_DESTINATION)}) {
                    androidx.compose.material3.Icon(Icons.Filled.ArrowForward, null)
                }
            })



        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .size(400.dp)
            )
            Text(
                text = "Let's plan your next vacation!",
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            ) }
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "What's your destination?")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Worldwide Destinations",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))


       Row(modifier = Modifier
           .horizontalScroll(rememberScrollState())
           .padding(start = 5.dp)) {

//Box 1
           Card() {
               androidx.compose.foundation.layout.Box(
                   modifier = Modifier
                       .height(150.dp)
                       .width(200.dp),
                   contentAlignment = Alignment.Center
               ) {

                   Image(
                       painter = painterResource(id = R.drawable.img_10),
                       contentDescription = "",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .fillMaxHeight()
                           .fillMaxWidth()
                           .size(400.dp)
                           .clickable {
                               navController.navigate(ROUT_CITIES)
                           }
                   )
                   Text(
                       text = "Paris",
                       textAlign = TextAlign.Center,
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color.White
                   )
               }

           }
           Spacer(modifier = Modifier.width(5.dp))


//Box 1
           Card() {
               androidx.compose.foundation.layout.Box(
                   modifier = Modifier
                       .height(150.dp)
                       .width(200.dp),
                   contentAlignment = Alignment.Center
               ) {

                   Image(
                       painter = painterResource(id = R.drawable.img_11),
                       contentDescription = "",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .fillMaxHeight()
                           .fillMaxWidth()
                           .size(400.dp)
                           .clickable {
                               navController.navigate(ROUT_CITIES)
                           }
                   )
                   Text(
                       text = "New York City",
                       textAlign = TextAlign.Center,
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color.White
                   )
               }

           }

           Spacer(modifier = Modifier.width(5.dp))


//Box 1
           Card() {
               androidx.compose.foundation.layout.Box(
                   modifier = Modifier
                       .height(150.dp)
                       .width(200.dp),
                   contentAlignment = Alignment.Center
               ) {

                   Image(
                       painter = painterResource(id = R.drawable.img_12),
                       contentDescription = "",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .fillMaxHeight()
                           .fillMaxWidth()
                           .size(400.dp)
                           .clickable {
                               navController.navigate(ROUT_CITIES)
                           }
                   )
                   Text(
                       text = "London",
                       textAlign = TextAlign.Center,
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color.White
                   )
               }
           }


           Spacer(modifier = Modifier.width(10.dp))


//Box 1
           Card() {
               androidx.compose.foundation.layout.Box(
                   modifier = Modifier
                       .height(150.dp)
                       .width(200.dp),
                   contentAlignment = Alignment.Center
               ) {

                   Image(
                       painter = painterResource(id = R.drawable.img_13),
                       contentDescription = "",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .fillMaxHeight()
                           .fillMaxWidth()
                           .size(400.dp)
                           .clickable {
                               navController.navigate(ROUT_CITIES)
                           }
                   )
                   Text(
                       text = "Manchester",
                       textAlign = TextAlign.Center,
                       fontSize = 30.sp,
                       fontWeight = FontWeight.Bold,
                       color = Color.White
                   )
               }

           }
       }


           Spacer(modifier = Modifier.height(20.dp))
           OutlinedButton(
               onClick = {
                         navController.navigate(ROUT_DESTINATION)
               },
               modifier = Modifier
                   .size(width = 300.dp, height = 70.dp)
                   .padding(start = 80.dp),
               shape = CutCornerShape(5.dp),
               border = BorderStroke(3.dp, Color.Blue)
           ) {
               Text(text = "Show all", color = Color.Blue, fontSize = 20.sp)
           }





    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
        HomeScreen(rememberNavController())

}

