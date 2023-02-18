package com.example.fragmentjuuris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), ListFragment.itemSelected {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDescription= findViewById<TextView>(R.id.tvDescription)

        val description = ArrayList<String>()
        description.add("Description for item 1")
        description.add("Description for item 2")
        description.add("Description for item 3")


    }
}