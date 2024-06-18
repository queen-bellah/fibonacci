package com.akirackix.recyleviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirackix.recyleviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val numbers = fibonacci(100)
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        var numberAdapter = NamesRecyclerViewAdapter(numbers)
        binding.rvNames.adapter = numberAdapter
            }
   fun fibonacci(n:Int):List<Int>{
       var numbers = mutableListOf(0,1)
       while (numbers.size < n){
           numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex -1])
       }
       return numbers
   }

}