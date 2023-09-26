package com.example.firebasestorage

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

class InsertActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            firebaseUI()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun firebaseUI() {
    val context= LocalContext.current
    val hotelname= remember { mutableStateOf("") }
    val location = remember { mutableStateOf("") }
    val managername = remember { mutableStateOf("") }
    val managercontact = remember { mutableStateOf("") }
    val hotelprice = remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(Color.White),
    ) {

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { Text("Add More Hotels") },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Share, null)
                }
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Settings, null)
                }
            })
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = hotelname.value,
                onValueChange = { hotelname.value = it },
                placeholder = { Text(text = "Hotel name") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = location.value,
                onValueChange = { location.value = it },
                placeholder = { Text(text = "Location") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = managername.value,
                onValueChange = { managername.value = it },
                placeholder = { Text(text = "Manager name") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = managercontact.value,
                onValueChange = { managercontact.value = it },
                placeholder = { Text(text = "Enter your Contacts") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = hotelprice.value,
                onValueChange = { hotelprice.value = it },
                placeholder = { Text(text = "Hotel Price") },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
                singleLine = true,
            )

            Button(
                onClick = {
                    if (TextUtils.isEmpty(hotelname.value.toString())) {
                        Toast.makeText(context, "Please enter hotel name", Toast.LENGTH_SHORT)
                            .show()
                    } else if (TextUtils.isEmpty(location.value.toString())) {
                        Toast.makeText(context, "Please enter location", Toast.LENGTH_SHORT)
                            .show()
                    } else if (TextUtils.isEmpty(managername.value.toString())) {
                        Toast.makeText(
                            context,
                            "Please enter manager name",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else if (TextUtils.isEmpty(managercontact.value.toString())) {
                            Toast.makeText(
                                context,
                                "Please enter manager contact",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                    }
                    else if (TextUtils.isEmpty(hotelprice.value.toString())) {
                        Toast.makeText(
                            context,
                            "Please enter hotel price",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                    else {
                        addDataToFirebase(
                            hotelname.value, location.value, managername.value,managercontact.value,hotelprice.value, context
                        )
                    }
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = CutCornerShape(5.dp)
            ) {

                Text(text = "Save", modifier = Modifier.padding(10.dp))
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    context.startActivity(Intent(context,DetailsActivity::class.java))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CutCornerShape(5.dp)
            ) {
                Text(text = "See Additional hotels", modifier = Modifier.padding(10.dp))
            }
        }
    }
}

fun addDataToFirebase(hotelname: String, location: String, managername: String,managercontact:String,hotelprice:String,
                      context: Context
) {
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()
    val dbCourses: CollectionReference = db.collection("Tourguides")
    val tour = Tourguide(hotelname,location,managername,managercontact,hotelprice)
    dbCourses.add(tour).addOnSuccessListener {
        Toast.makeText(context, "Hotel Successfully added", Toast.LENGTH_SHORT).show()

    }.addOnFailureListener { e ->
        Toast.makeText(context, "Fail to add hotel", Toast.LENGTH_SHORT).show()
    }

}

@Preview(showBackground = true)
@Composable
fun FirebaseUiPreview() {
    firebaseUI()
}