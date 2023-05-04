package com.example.mybooks.ui.audio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mybooks.R
import com.example.mybooks.databinding.FragmentAudioBinding


class AudioFragment : Fragment() {

    private lateinit var binding: FragmentAudioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAudioBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivArrowBack.setOnClickListener {
            findNavController().navigateUp()
            findNavController().popBackStack()
        }
        binding.ivBook.setOnClickListener {
            findNavController().navigate(R.id.libFragment)
        }
    }
}