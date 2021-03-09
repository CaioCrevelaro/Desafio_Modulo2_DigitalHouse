package com.br.digitalhousefoods.model

data class Restaurant(
        val restaurantName: String,
        val restaurantAddress: String,
        val restaurantClosingTime: String,
        val restaurantImage: Int,
        val restaurantMenu:List<Meal>)