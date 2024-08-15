package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo("wish_title")
    val title: String = "",
    @ColumnInfo("wish_desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch"),
        Wish(title = "Oculus Quest", description = "Virtual Reality Headset"),
        Wish(title = "PlayStation 5", description = "Gaming Console")

    )
}
