package com.br.digitalhousefoods.data

import com.br.digitalhousefoods.R
import com.br.digitalhousefoods.model.Meal
import com.br.digitalhousefoods.model.Restaurant

val MEAL = Meal(
    "Salada com molho Gengibre ",
    "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
    R.drawable.meal,
    49.90)

public object Data {

    fun data(): List<Restaurant>{

        val meal = Meal(
            "Salada com molho Gengibre ",
            "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            R.drawable.meal,
            49.90)

        val listMeal = mutableListOf<Meal>()
        for (i in 1..10) {listMeal.add(meal)}

        val tonyRomas = Restaurant(
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "22:00",
            R.drawable.tonyromas,
            listMeal.toList())

        val aoyamaMoema = Restaurant(
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "00:00",
            R.drawable.aoyama,
            listMeal.toList())

        val outbackMoema = Restaurant(
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            "00:00",
            R.drawable.outback,
            listMeal.toList())

        val siSenor = Restaurant(
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            "01:00",
            R.drawable.sisenor,
            listMeal.toList())

        val restaurantsList = listOf<Restaurant>(tonyRomas,aoyamaMoema,outbackMoema,siSenor)

        return restaurantsList
    }
}
