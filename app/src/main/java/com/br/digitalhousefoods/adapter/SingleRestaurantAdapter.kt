package com.br.digitalhousefoods.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.adapter.viewHolder.SingleRestaurantViewHolder
import com.br.digitalhousefoods.model.Meal
import com.br.digitalhousefoods.view.MealDetailActivity

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

        val meal = holder.itemView
        meal.setOnClickListener {
            Log.i("CLICk", "${name.text} meal was selected")
            val intent = Intent(it.context, MealDetailActivity::class.java)

            intent.putExtra("NAME", mealList[position].mealName)
            intent.putExtra("IMAGE", mealList[position].mealImage)
            intent.putExtra("DESC", mealList[position].mealDescription)
            intent.putExtra("PRICE", mealList[position].mealPrice)

            it.context.startActivity(intent)
        }

    }

    override fun getItemCount() = mealList.size
}