package com.example.firebasestorage.screens.signup

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.firebasestorage.data.AuthViewModel
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_SIGNUP
import com.example.firebasestorage.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {
    var mContext = LocalContext.current
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by remember { mutableStateOf(TextFieldValue("")) }
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img_1), contentScale = ContentScale.FillBounds), horizontalAlignment = Alignment.CenterHorizontally) {



        Spacer(modifier = Modifier.height(20.dp))

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.register))
        val progress by animateLottieCompositionAsState(composition )

        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp))

        //Textfields
        Column(modifier = Modifier.padding(20.dp)) {
            OutlinedTextField(value = firstname ,
                onValueChange = {firstname=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Firstname")},
                placeholder = { Text(text = "Enter firstname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = lastname ,
                onValueChange = {lastname=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Lastname")},
                placeholder = { Text(text = "Enter lastname")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = email ,
                onValueChange = {email=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Email Address")},
                placeholder = { Text(text = "Enter email")},
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

            )

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = password ,
                onValueChange = {password=it},
                shape = CutCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Password")},
                placeholder = { Text(text = "Type your password")},
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )

        }

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, mContext)
            xyz.signup(email.text.trim(),password.text.trim())
        },
            colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.width(300.dp),
            shape = CutCornerShape(10.dp)) {
            Text(text = "Register")
        }

            Text(text = "Need an Account?",
                modifier = Modifier.clickable {
                    navController.navigate(ROUT_LOGIN)
                },
                fontSize = 15.sp)

    }
}

@Preview(showBackground = true)
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}