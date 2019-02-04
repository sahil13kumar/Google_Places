package com.example.sahil.googlenewplaces

import com.google.gson.annotations.SerializedName

data class Photositem (
        @SerializedName("height")
        val height:Int=0,
        @SerializedName("width")
        val width:Int=0,
        @SerializedName("html_attributions")
        val htmlAttributions:List<String>?,
        @SerializedName("photo_reference")
        val photo_reference:String=""


)