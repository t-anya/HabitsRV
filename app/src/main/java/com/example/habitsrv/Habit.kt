package com.example.habitsrv

data class Habit(val title: String , val description: String,val image :Int)

fun getSampleHabits(): List<Habit>{
    return listOf(
        Habit("Go for walk","Refreshes your body",R.drawable.water),
        Habit("Have Coffee","Takes away tiredness",R.drawable.coffee)
    )
}