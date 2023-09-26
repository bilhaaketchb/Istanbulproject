package com.example.firebasestorage.screens.cities

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.data.UiToolingDataApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.LocationActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_DESTINATION
import com.example.firebasestorage.navigation.ROUT_EXPLORECITIES
import com.example.firebasestorage.navigation.ROUT_HOTEL
import com.example.firebasestorage.navigation.ROUT_MUSEUM

@OptIn(ExperimentalMaterial3Api::class, UiToolingDataApi::class)
@Composable
fun CitiesScreen(navController: NavController) {
    var mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_DESTINATION) }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_EXPLORECITIES)}) {
                    Icon(Icons.Filled.ArrowForward, null)
                }
            })

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_14),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .size(200.dp)
            )

            Text(
                text = "London",
                textAlign = TextAlign.End,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Button 1
        OutlinedButton(
            onClick = {
                navController.navigate(ROUT_EXPLORECITIES)
            },
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)
                .padding(start = 20.dp),
            border = BorderStroke(3.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(Color.White)

        ) {
            Image(painter = painterResource(id = R.drawable.img_24), contentDescription = "")
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "Things To Do", color = Color.Black, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))

        //Button 2
        OutlinedButton(
            onClick = {
                navController.navigate(ROUT_HOTEL)
            },
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)
                .padding(start = 20.dp),
            border = BorderStroke(3.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.img_26), contentDescription = "")
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "Hotels", color = Color.Black, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))
        //Button 3
        OutlinedButton(
            onClick = {
                navController.navigate(ROUT_MUSEUM)
            },
            modifier = Modifier
                .size(width = 350.dp, height = 70.dp)
                .padding(start = 20.dp),
            border = BorderStroke(3.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.img_29), contentDescription = "")
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "Museums, Attractions & Tickets", color = Color.Black, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(10.dp))
        //Button 4
        OutlinedButton(
            onClick = {
               mContext.startActivity(Intent(mContext,LocationActivity::class.java))
            },
            modifier = Modifier
                .size(width = 350.dp, height = 50.dp)
                .padding(start = 20.dp),
            border = BorderStroke(3.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Image(painter = painterResource(id = R.drawable.img_30), contentDescription = "")
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "See Location", color = Color.Black, fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Things To Do",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(5.dp))


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
                        painter = painterResource(id = R.drawable.img_75),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                    )
                    Text(
                        text = "Kids London Attractions",
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
                        painter = painterResource(id = R.drawable.img_76),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                    )
                    Text(
                        text = "Visit The portable Wife Site",
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
                        painter = painterResource(id = R.drawable.img_77),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                    )
                    Text(
                        text = "Family Fun Time",
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
                        painter = painterResource(id = R.drawable.img_78),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                    )
                    Text(
                        text = "Attractions Site",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
        }




    }

}


@Preview(showBackground = true)
@Composable
fun CitiesPreview(){
    CitiesScreen(rememberNavController())
}