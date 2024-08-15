package com.example.wishlistapp

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class WishViewModel: ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChange(newString: String){
        wishTitleState = newString
    }

    fun onWishDescriptionChange(newString: String){
        wishDescriptionState = newString
    }

}