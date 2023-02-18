package com.example.fragmentjuuris

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class ListFragment : Fragment() {

    private lateinit var activity: itemSelected

    interface itemSelected {
        fun onItemSelected(index: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        activity =  context as itemSelected
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val listView = view.findViewById<ListView>(R.id.list_view)

        val data: ArrayList<String>  = ArrayList()
        data.add("1. This is item 1")
        data.add("2. This is item 2")
        data.add("3. This is item 3")

        listView.adapter = ArrayAdapter<String>(requireActivity(), android.R.layout.simple_list_item_1, data)

        listView.setOnItemClickListener { parent, view, position, id ->
            onListItemClick(parent as ListView, view, position, id)
        }

        return view
    }

  fun onListItemClick(parent: ListView, view: View, position: Int, id: Long) {
        // Handle list item click event
      activity.onItemSelected(position)
    }
}
