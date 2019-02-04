package com.example.sahil.googlenewplaces

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_places.*
import kotlinx.android.synthetic.main.list_places.view.*


class ListOfPlaces : Fragment()
{

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater.inflate(R.layout.list_places,
                container,false)

        var tempList = mutableListOf<String>()

        for( item in places_list!!)
        {
            tempList.add("Name : ${item.name} \nVicinity : ${item.vicinity} Rating: ${item.rating}")
        }

        var myadapter = ArrayAdapter<String>(activity,
                R.layout.indiview,tempList)
        v.lview.adapter = myadapter

        v.lview.setOnItemClickListener { adapterView, view, i, l ->
            var it = Intent(context,IndivisualMap::class.java)
            it.putExtra("latt", places_list!!.get(i).geometry.location.lat.toString())
            it.putExtra("lang", places_list!!.get(i).geometry.location.lng.toString())
            startActivity(it)

        }
        return  v

    }


}