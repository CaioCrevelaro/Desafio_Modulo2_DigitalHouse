package com.br.digitalhousefoods.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.viewHolder.RestaurantsViewHolder
import com.br.digitalhousefoods.model.Restaurant

class RestaurantsAdapter(val restaurantsList: List<Restaurant>):RecyclerView.Adapter<RestaurantsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_restaurants, parent, false)
        return RestaurantsViewHolder(view)

    }

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {


        val image = holder.imageRestaurant
        image.setImageResource(restaurantsList[position].restaurantImage)

        val name = holder.nameRestaurant
        name.text = restaurantsList[position].restaurantName

        val address = holder.addressRestaurant
        address.text = restaurantsList[position].restaurantAddress

        val closingTime = holder.closingTimeRestaurant
        val closingText: String = "Fecha às "
        val time = restaurantsList[position].restaurantClosingTime
        closingTime.text = closingText.plus(time)

    }

    override fun getItemCount() = restaurantsList.size
}