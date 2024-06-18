package com.akirackix.recyleviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdapter(var fibonnaci:List<Int>): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return nbrs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.tvName.text = nbrs[position]

    }

}
class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
}