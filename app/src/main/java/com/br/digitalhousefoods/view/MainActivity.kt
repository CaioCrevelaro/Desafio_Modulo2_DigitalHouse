package com.br.digitalhousefoods.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.RestaurantsAdapter
import com.br.digitalhousefoods.data.Data
import com.br.digitalhousefoods.model.Restaurant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restaurants_recicler_view by lazy { findViewById<RecyclerView>(R.id.main_activity_recycler_view) }

        val restaurantsList = Data.data()
        Log.i("DATA","Requisition of restaurants data is completed")

        restaurants_recicler_view.layoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false)

//        restaurants_recicler_view.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        restaurants_recicler_view.adapter = RestaurantsAdapter(restaurantsList)

    }

}