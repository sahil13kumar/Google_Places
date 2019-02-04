package com.example.sahil.googlenewplaces

import com.google.gson.annotations.SerializedName

data class OpeningHours (
        @SerializedName("open_now")
        val open_now:Boolean = false
)