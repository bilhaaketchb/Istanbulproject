package com.example.firebasestorage.screens.explore3

import android.content.Intent
import android.graphics.Paint.Align
import android.media.audiofx.BassBoost
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CITIES
import com.example.firebasestorage.navigation.ROUT_CITIES2
import com.example.firebasestorage.navigation.ROUT_CITIES3
import com.example.firebasestorage.navigation.ROUT_HOTEL
import com.example.firebasestorage.navigation.ROUT_HOTEL2
import com.example.firebasestorage.navigation.ROUT_HOTEL3


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore3Screen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = {  },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/
                    navController.navigate(ROUT_CITIES3)
                }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }}, actions = {
                IconButton(onClick = {/* Do Something*/
                    navController.navigate(ROUT_HOTEL3)
                }) {
                    Icon(Icons.Filled.ArrowForward, null)
                }
            })
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Things To Do", color = Color.Black,
            fontSize = 20.sp,
            textAlign = TextAlign.Center)

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
                            painter = painterResource(id = R.drawable.img_60), contentDescription = "",
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
                        text = "Visit City's Playground",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "12,500 reviewers",
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
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)

                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Black)) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.60,000",
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
                            painter = painterResource(id = R.drawable.img_61), contentDescription = "",
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
                        text = "Visit Japan's Sights",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "8,253 reviewers",
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
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Black)) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.28,000",
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
                            painter = painterResource(id = R.drawable.img_62), contentDescription = "",
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
                        text = "Iconic Places",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "3,004 reviewers",
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
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Black)) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.50,256",
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
                            painter = painterResource(id = R.drawable.img_63), contentDescription = "",
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
                        text = "Touring Fun Places",
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {


                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp),  tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "3,813 reviewers",
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
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:+254707343754".toUri()
                                mContext.startActivity(callIntent)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Black)) {
                            Text(text = "Call", color = Color.Black, fontSize = 13.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.33,000",
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
                            painter = painterResource(id = R.drawable.img_64), contentDescription = "",
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
                        text = "Visiting the coolest Sites",
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row() {

                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp), tint = Color.Blue )
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp), tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp), tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp), tint = Color.Blue)
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "", modifier = Modifier.size(13.dp), tint = Color.Black)

                        Spacer(modifier = Modifier.width(40.dp))
                        Text(
                            text = "2,372 reviewers",
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
                                navController.navigate(ROUT_CITIES3)
                            },
                            modifier = Modifier
                                .size(width = 80.dp, height = 30.dp),
                            shape = RoundedCornerShape(5.dp),
                            border = BorderStroke(2.dp, Color.Black)) {
                            Text(text = "Call", color = Color.Black, fontSize = 10.sp)
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "From ksh.27,000",
                            fontSize = 15.sp,
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.End
                        )



                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedButton(
                onClick = {
                    navController.navigate(ROUT_HOTEL3)
                },
                modifier = Modifier
                    .size(width = 300.dp, height = 70.dp)
                    .padding(start = 80.dp),
                shape = CutCornerShape(5.dp),
                border = BorderStroke(3.dp, Color.Blue)
            ) {
                Text(text = "Next", color = Color.Blue, fontSize = 20.sp)
            }





        }



    }


}



@Preview(showBackground = true)
@Composable
fun Explore3ScreenPreview() {
    Explore3Screen(rememberNavController())

}




