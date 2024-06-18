package com.akirackix.recyleviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirackix.recyleviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        var nbrs = fibonacci(100)
      binding.rvNames.layoutManager = LinearLayoutManager
var numbers=NamesRecyclerViewAdapter(number)
        binding.rvNames.adapter=numbers
    }
    fun fibonacci(n:Int):List<Int>{
        val numbers =
    }

}