package com.example.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch"),
        Wish(title = "Oculus Quest", description = "Virtual Reality Headset"),
        Wish(title = "PlayStation 5", description = "Gaming Console")

    )
}
