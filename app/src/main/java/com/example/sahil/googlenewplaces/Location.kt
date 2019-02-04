package com.example.sahil.googlenewplaces

import com.google.gson.annotations.SerializedName

data class Location (
        @SerializedName("lat")
        val lat:Double=0.0,
        @SerializedName("lng")
        val lng:Double = 0.0
    )