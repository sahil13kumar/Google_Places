package com.example.sahil.googlenewplaces

import com.google.gson.annotations.SerializedName

data class Viewport (
        @SerializedName("southwest")
        val southwest: Southwest,
        @SerializedName("northeast")
        val northeast:Northeast
)