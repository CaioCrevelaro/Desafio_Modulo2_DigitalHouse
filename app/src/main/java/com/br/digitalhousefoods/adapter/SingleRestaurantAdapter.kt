package com.br.digitalhousefoods.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.viewHolder.SingleRestaurantViewHolder
import com.br.digitalhousefoods.model.Meal

class SingleRestaurantAdapter(
    val mealList: List<Meal>
): RecyclerView.Adapter<SingleRestaurantViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SingleRestaurantViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_single_restaurant, parent, false)
        return SingleRestaurantViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SingleRestaurantViewHolder,
        position: Int) {

        val image = holder.mealImage
        image.setImageResource(mealList[position].mealImage)

        val name = holder.mealName
        name.text = mealList[position].mealName

    }

    override fun getItemCount() = mealList.size
}