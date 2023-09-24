package com.example.firebasestorage.screens.hotels

import android.content.Intent
import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_BOOKING
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_EXPLORECITIES
import com.example.firebasestorage.navigation.ROUT_HOTEL
import com.example.firebasestorage.navigation.ROUT_MUSEUM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HotelScreen(navController: NavController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(ROUT_CITIES) }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Search, null)
                }
            })
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Hotels Rooms",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black
        )

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Row1
            Row(modifier = Modifier.padding(10.dp)) {
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_42),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Augustine's Hotels And Resorts",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )

                        Spacer(modifier = Modifier.width(40.dp))

                        Text(
                            text = "15 reviews",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                        Spacer(modifier = Modifier.height(50.dp))
                    }

                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_BOOKING)
                            },

                            modifier = Modifier
                                .size(width = 100.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Book Now", color = Color.Black, fontSize = 10.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.48,368",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
                }
            Row(modifier = Modifier.padding(10.dp)) {
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_47),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text ="  Billy Park Hotel,London",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )

                        Spacer(modifier = Modifier.width(40.dp))

                        Text(
                            text = "17 reviews",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )


                        Spacer(modifier = Modifier.height(50.dp))

                    }

                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_BOOKING)
                            },
                            modifier = Modifier
                                .size(width = 100.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Book Now", color = Color.Black, fontSize = 10.sp) }

                           Spacer(modifier = Modifier.width(30.dp))

                        Text(
                            text = "From ksh.33,205",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Row(modifier = Modifier.padding(10.dp)) {
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_48),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Snow White ",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )

                        Spacer(modifier = Modifier.width(40.dp))

                        Text(
                            text = "13 reviews",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )


                        Spacer(modifier = Modifier.height(50.dp))

                    }

                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_BOOKING)
                            },
                            modifier = Modifier
                                .size(width = 100.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Book Now", color = Color.Black, fontSize = 10.sp)
                        }

                        Spacer(modifier = Modifier.width(30.dp))
                        
                        Text(
                            text = "From ksh.23,409",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                }

            }

            Row(modifier = Modifier.padding(10.dp)) {
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_49),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Metropolitan Inn",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )

                        Spacer(modifier = Modifier.width(40.dp))

                        Text(
                            text = "19 reviews",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )


                        Spacer(modifier = Modifier.height(50.dp))

                    }

                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_BOOKING)
                            },
                            modifier = Modifier
                                .size(width = 100.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Book Now", color = Color.Black, fontSize = 10.sp)
                        }

                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.56,355",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Row(modifier = Modifier.padding(10.dp)) {
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_50),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = " Robinson Inn",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            modifier = Modifier.size(13.dp),
                            tint = Color.Red
                        )

                        Spacer(modifier = Modifier.width(40.dp))

                        Text(
                            text = "18 reviews",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )


                        Spacer(modifier = Modifier.height(50.dp))

                    }

                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_BOOKING)
                            },
                            modifier = Modifier
                                .size(width = 100.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Book Now", color = Color.Black, fontSize = 10.sp)
                        }

                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.21,602",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )
                    }
                    Spacer(modifier = Modifier.height(40.dp))

                    OutlinedButton(
                        onClick = {
                            navController.navigate(ROUT_MUSEUM)
                        },
                        modifier = Modifier
                            .size(width = 300.dp, height = 50.dp)
                            .padding(start = 80.dp),
                        shape = CutCornerShape(5.dp),
                        border = BorderStroke(3.dp, Color.Blue)
                    ) {
                        Text(text = "Next", color = Color.Blue, fontSize = 20.sp)
                    }


                }

            }


            }


}



}
@Preview(showBackground = true)
@Composable
fun HotelPreview(){
    HotelScreen( rememberNavController())

}