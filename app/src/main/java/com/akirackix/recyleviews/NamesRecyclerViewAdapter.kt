package com.akirackix.recyleviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdapter(var numbers:List<Int>): RecyclerView.Adapter<NumbersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
var numberView = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NumbersViewHolder(numberView)

    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text = numbers[position].toString()


    }

}
class NumbersViewHolder(numberView: View) :RecyclerView.ViewHolder(numberView){
   var tvNumber: TextView = numberView.findViewById<TextView>(R.id.tvName)
}