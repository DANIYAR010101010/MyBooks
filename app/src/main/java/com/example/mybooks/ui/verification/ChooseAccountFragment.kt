package com.example.mybooks.ui.verification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mybooks.R
import com.example.mybooks.databinding.FragmentChooseAccountBinding

class ChooseAccountFragment : Fragment() {

    private lateinit var binding: FragmentChooseAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChooseAccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.constraintAvatar.setOnClickListener {
            findNavController().navigate(R.id.welcomeFragment)
        }
    }
}