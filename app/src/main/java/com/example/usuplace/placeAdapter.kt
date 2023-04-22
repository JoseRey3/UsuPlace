package com.example.usuplace

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class placeAdapter (private val place: List<placeCategory>): RecyclerView.Adapter<placeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): placeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return placeViewHolder(view)

    }

    override fun onBindViewHolder(holder: placeViewHolder, position: Int) {
        holder.render(place[position])
    }

    override fun getItemCount() = place.size
}