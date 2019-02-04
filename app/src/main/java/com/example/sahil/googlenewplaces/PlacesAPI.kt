package com.example.sahil.googlenewplaces

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlacesAPI {
    @GET("maps/api/place/nearbysearch/json?key=API_KEY")

    fun getPlaces(@Query("location") loc:String,
                  @Query("type") t:String,
                  @Query("radius") r:Int):Call<PlacesPOJO>
}


