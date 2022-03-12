package com.example.averresponde.presentacion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.averresponde.databinding.FragmentPantallaCorrectoBinding


class FragmentPantallaCorrect : Fragment() {

    private lateinit var binding: FragmentPantallaCorrectoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPantallaCorrectoBinding.inflate(inflater,container, false)
        return binding.root

    }


}