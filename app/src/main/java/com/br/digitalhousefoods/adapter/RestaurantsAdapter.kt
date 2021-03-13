package com.br.digitalhousefoods.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.viewHolder.RestaurantsViewHolder
import com.br.digitalhousefoods.model.Restaurant
import com.br.digitalhousefoods.view.MainActivity
import com.br.digitalhousefoods.view.SingleRestaurantActivity

class RestaurantsAdapter(val restaurantsList: List<Restaurant>):RecyclerView.Adapter<RestaurantsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_restaurants, parent, false)
        return RestaurantsViewHolder(view)

    }

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {


        val image = holder.imageRestaurant
        val singleImage = restaurantsList[position].restaurantImage
        image.setImageResource(restaurantsList[position].restaurantImage)

        val name = holder.nameRestaurant
        name.text = restaurantsList[position].restaurantName
        val singleName = name.text

        val address = holder.addressRestaurant
        address.text = restaurantsList[position].restaurantAddress

        val closingTime = holder.closingTimeRestaurant
        val closingText: String = "Fecha às "
        val time = restaurantsList[position].restaurantClosingTime
        closingTime.text = closingText.plus(time)

//        The goal of this method is get the information of the card that was clicked and deliver to the SingleRestaurantActivity
//        The SingleRestaurantActivity is a generic Activity created to display the menu of a single restaurant

        val card = holder.itemView
        card.setOnClickListener {
            Log.i("CLICK", "${name.text} card was clicked")
            val intent = Intent(it.context, SingleRestaurantActivity::class.java)
            intent.putExtra("IMAGE", restaurantsList[position].restaurantImage)
            intent.putExtra("NAME", restaurantsList[position].restaurantName)
            it.context.startActivity(intent)

        }
    }

    override fun getItemCount() = restaurantsList.size
}