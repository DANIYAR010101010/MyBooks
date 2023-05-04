package com.example.mybooks.ui.detail_for_star

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooks.R
import com.example.mybooks.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivArr.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnNtxt.setOnClickListener {
            findNavController().navigate(R.id.testForStarFragment)
        }
        binding.btnListen.setOnClickListener {
            findNavController().navigate(R.id.audioFragment)
        }
    }
}