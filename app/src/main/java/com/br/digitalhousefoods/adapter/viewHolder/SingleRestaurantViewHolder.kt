package com.br.digitalhousefoods.adapter.viewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import org.w3c.dom.Text

class SingleRestaurantViewHolder(
    view: View
): RecyclerView.ViewHolder(view) {

    val mealImage by lazy { itemView.findViewById<ImageView>(R.id.meal_image)}
    val mealName by lazy { itemView.findViewById<TextView>(R.id.meal_name) }

}