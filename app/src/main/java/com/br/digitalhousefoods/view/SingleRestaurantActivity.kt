package com.br.digitalhousefoods.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.SingleRestaurantAdapter
import com.br.digitalhousefoods.data.Data
import com.br.digitalhousefoods.model.Restaurant

class SingleRestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_restaurant)

        val single_restaurant_recycler_view by lazy { findViewById<RecyclerView>(R.id.single_restaurant_recycler_view) }
        val single_restaurant_image by lazy { findViewById<ImageView>(R.id.single_restaurant_image) }
        val single_restaurant_name by lazy { findViewById<TextView>(R.id.single_restaurant_name) }
        val arrowBack by lazy { findViewById<ImageButton>(R.id.restaurant_back_button) }

        val restaurant = intent.extras
        val name = restaurant?.getString("NAME")
        val image = restaurant?.getInt("IMAGE")

        image?.let { single_restaurant_image.setImageResource(it) }
        single_restaurant_name.text = name!!


        val resObject = Data.data().find { it.restaurantName.equals(name)}
        val mealList = resObject?.restaurantMenu


        single_restaurant_recycler_view.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        single_restaurant_recycler_view.adapter = mealList?.let { SingleRestaurantAdapter(it) }

        arrowBack.setOnClickListener { onBackPressed() }




    }
}