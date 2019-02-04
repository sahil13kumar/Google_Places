package com.example.sahil.googlenewplaces

import com.google.gson.annotations.SerializedName


data class Northeast (@SerializedName("lng")
                      val lng:Double=0.0,
                      @SerializedName("lat")
                      val lat:Double = 0.0
)