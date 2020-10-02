package com.example.habitsrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>): RecyclerView.Adapter<HabitsAdapter.HabitVH>() {
    class HabitVH(val card: View):RecyclerView.ViewHolder(card)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card,parent,false)
        return HabitVH(view)
    }

    override fun getItemCount(): Int{
        return habits.size
    }

    override fun onBindViewHolder(holder: HabitVH, position: Int) {
            val habit = habits[position]
            holder.card.tv_title.text = habit.title
            holder.card.tv_description.text = habit.description
            holder.card.iv1.setImageResource(habit.image)
    }
}