package com.dandt.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dandt.recyclerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    lateinit var nameRecyclerAdapter: NameRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

//        var nameList: List<String> = listOf("Alice","Totoro", "Picachu")

        var personList: List<Person> = listOf(
            Person("Alice", "03984833"),
            Person("Totoro", "23894883")
        )

        nameRecyclerAdapter = NameRecyclerAdapter(personList)

        mainBinding.recyclerList.adapter = nameRecyclerAdapter
    }
}