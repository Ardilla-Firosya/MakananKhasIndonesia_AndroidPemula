package com.example.projectandroidpemula

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    var name: String = "",
    var description: String ="",
    var photo: Int = 0,
    var bahan_bahan: String =""


) : Parcelable
