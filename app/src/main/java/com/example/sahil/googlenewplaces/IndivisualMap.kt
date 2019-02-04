package com.example.sahil.googlenewplaces

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class IndivisualMap : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indivisual_map)

        var latt = intent.getStringExtra("latt")
        var lang = intent.getStringExtra("lang")

        var sfrag = supportFragmentManager.findFragmentById(R.id.frag1) as SupportMapFragment
        sfrag.getMapAsync(object :OnMapReadyCallback{
            override fun onMapReady(p0: GoogleMap?) {
               var option = MarkerOptions()
                option.position(LatLng(latt.toDouble(),lang.toDouble()))
                option.icon(BitmapDescriptorFactory.fromResource(android.R.drawable.ic_menu_mylocation))
                p0?.addMarker(option)
                p0?.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(latt.toDouble(),lang.toDouble()),15f))
            }


        })
    }
}
