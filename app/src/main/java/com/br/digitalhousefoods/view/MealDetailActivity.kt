package com.br.digitalhousefoods.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.br.digitalhousefoods.R


class MealDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_detail)

        val mealName by lazy { findViewById<TextView>(R.id.meal_detail_name) }
        val mealDesc by lazy { findViewById<TextView>(R.id.meal_detail_description) }
        val mealImage by lazy { findViewById<ImageView>(R.id.meal_detail_image) }
        val backButton by lazy { findViewById<ImageButton>(R.id.meal_back_button) }

        val meal = intent.extras
        val name = meal?.getString("NAME")
        val image = meal?.getInt("IMAGE")
        val desc = meal?.getString("DESC")
        val price = meal?.getString("PRICE")

        mealName.text = name
        mealDesc.text = desc
        mealImage.setImageResource(image!!)

        backButton.setOnClickListener { onBackPressed() }

    }
}