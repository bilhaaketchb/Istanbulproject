package com.example.firebasestorage.screens.hotels6

import android.content.Intent
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
import androidx.compose.material.icons.filled.ArrowForward
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
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_BOOKING
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_CITIES2
import com.example.firebasestorage.navigation.ROUT_CITIES3
import com.example.firebasestorage.navigation.ROUT_EXPLORECITIES
import com.example.firebasestorage.navigation.ROUT_HOTEL
import com.example.firebasestorage.navigation.ROUT_HOTEL2
import com.example.firebasestorage.navigation.ROUT_HOTEL3
import com.example.firebasestorage.navigation.ROUT_HOTEL4
import com.example.firebasestorage.navigation.ROUT_HOTEL5
import com.example.firebasestorage.navigation.ROUT_HOTEL6
import com.example.firebasestorage.navigation.ROUT_MUSEUM
import com.example.firebasestorage.navigation.ROUT_MUSEUM6

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HotelS6creen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = {  },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/
                    navController.navigate(ROUT_EXPLORECITIES)
                }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/
                    navController.navigate(ROUT_MUSEUM)
                }) {
                    Icon(Icons.Filled.ArrowForward, null)
                }
            })
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Hotel Rooms",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Row1
            Row (modifier = Modifier.padding(10.dp)){

                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_65), contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.DarkGray
                        )

                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Capsule Hotel",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "8,000 reviewers",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))
                    Row() {
                        OutlinedButton(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)

                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From Ksh.20,000",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))



            //Row1
            Row (modifier = Modifier.padding(10.dp)){
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_66), contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.DarkGray
                        )

                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Kimpton Hotel",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "6,000 reviewers",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))
                    Row() {
                        OutlinedButton(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = " From Ksh.22,550",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))



            //Row1
            Row (modifier = Modifier.padding(10.dp)){
                Card() {
                    Box(
                        modifier = Modifier
                            .height(170.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_67), contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.DarkGray
                        )
                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Imperial Hotel",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text ="8,000 reviewers",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))
                    Row() {
                        OutlinedButton(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.20,150",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))



            //Row1
            Row (modifier = Modifier.padding(10.dp)){
                Card() {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_68), contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.DarkGray

                        )

                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Godzilla Themed Room",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "1,680 reviewers",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))
                    Row() {
                        OutlinedButton(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = " ksh.36,000",
                            fontSize = 18.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))



            //Row1
            Row (modifier = Modifier.padding(10.dp)){
                Card() {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_69), contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )
                        Icon(
                            imageVector = Icons.Outlined.Favorite, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.DarkGray
                        )

                    }

                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Palace Hotel",
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(10.dp), tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(10.dp), tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(10.dp), tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(10.dp), tint = Color.Red)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(10.dp), tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "2,276 reviewers",
                            fontSize = 10.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )

                    }

                    Spacer(modifier = Modifier.height(50.dp))
                    Row() {
                        OutlinedButton(
                            onClick = {
                                navController.navigate(ROUT_MUSEUM)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Blue)
                        ) {
                            Text(text = "Call", color = Color.Black, fontSize = 10.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "ksh.25,000",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            OutlinedButton(
                onClick = {
                    navController.navigate(ROUT_MUSEUM6)
                },
                modifier = Modifier
                    .size(width = 300.dp, height = 50.dp)
                    .padding(start = 80.dp),
                shape = CutCornerShape(5.dp),
                border = BorderStroke(3.dp, Color.Black)
            ) {
                Text(text = "Next", color = Color.Black, fontSize = 20.sp)
            }







        }



    }

}
@Preview(showBackground = true)
@Composable
fun hotel6ScreenPreview(){
    HotelS6creen(rememberNavController())
}









