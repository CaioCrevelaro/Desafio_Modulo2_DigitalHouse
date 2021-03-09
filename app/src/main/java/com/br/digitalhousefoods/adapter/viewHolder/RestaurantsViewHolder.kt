package com.br.digitalhousefoods.adapter.viewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R

class RestaurantsViewHolder(
        view: View
) : RecyclerView.ViewHolder(view) {

    val imageRestaurant by lazy { itemView.findViewById<ImageView>(R.id.image_restaurant) }
    val nameRestaurant by lazy { itemView.findViewById<TextView>(R.id.name_restaurant) }
    val addressRestaurant by lazy { itemView.findViewById<TextView>(R.id.address_restaurant) }
    val closingTimeRestaurant by lazy { itemView.findViewById<TextView>(R.id.closing_time_restaurant) }
}