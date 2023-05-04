package com.example.mybooks.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooks.R
import com.example.mybooks.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: BooksAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivMenu.setOnClickListener {
            findNavController().navigate(R.id.menuFragment)
        }
        val list = arrayListOf<Int>()
        adapter = BooksAdapter(list)
        list.add(R.drawable.rectangle)
        list.add(R.drawable.book_q)
        list.add(R.drawable.book_w)
        list.add(R.drawable.book_e)
        list.add(R.drawable.image_book_van_gog)
        binding.recyclerBooks.adapter = adapter
    }
}