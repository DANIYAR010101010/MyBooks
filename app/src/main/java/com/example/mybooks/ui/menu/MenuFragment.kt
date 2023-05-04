package com.example.mybooks.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooks.R
import com.example.mybooks.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvMainSc.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.tvMyProfile.setOnClickListener {
            findNavController().navigate(R.id.profileFragment)
        }
        binding.tvPodcast.setOnClickListener {
            findNavController().navigate(R.id.libFragment)
        }
        binding.tvFavourites.setOnClickListener {
            findNavController().navigate(R.id.favFragment)
        }
    }
}