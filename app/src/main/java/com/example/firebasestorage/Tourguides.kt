package com.example.firebasestorage

import com.google.firebase.firestore.Exclude

data class Tourguides(
    @Exclude var hotelID: String? = "",
    var hotelname: String? = "",
    var location: String? = "",
    var managername: String? = "",
    var managercontact: String? = "",
    var hotelprice: String? = ""
)