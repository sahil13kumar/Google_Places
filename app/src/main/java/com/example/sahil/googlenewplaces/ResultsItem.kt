package com.example.sahil.googlenewplaces
import com.google.gson.annotations.SerializedName

data class ResultsItem (
        @SerializedName("types")
        val types:List<String>?,
        @SerializedName("name")
        val name: String = "",
        @SerializedName("vicinity")
        val vicinity:String="",
        @SerializedName("geometry")
        val geometry: Geometry,
        @SerializedName("opening_hours")
        val openingHours: OpeningHours,
        @SerializedName("id")
        val id: String = "",
        @SerializedName("photos")
        val photos: List<Photositem>?,
        @SerializedName("place_id")
        val placeId: String = "",
        @SerializedName("rating")
        val rating: Double = 0.0,
        @SerializedName("scope")
        val scope: String = "",
        @SerializedName("icon")
        val icon: String = "",
        @SerializedName("reference")
        val reference: String = "",
        @SerializedName("plus_code")
        val plusCode: PlusCode,
        @SerializedName("user_ratings_total")
        val userRatingsTotal: Int = 0
)