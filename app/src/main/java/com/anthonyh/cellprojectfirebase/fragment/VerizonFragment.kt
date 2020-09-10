package com.anthonyh.cellprojectfirebase.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.anthonyh.cellprojectfirebase.R
import com.anthonyh.cellprojectfirebase.databinding.FragmentVerizonBinding

class VerizonFragment: Fragment() {
//private lateinit var binding: FragmentVerizonBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = FragmentVerizonBinding.inflate(layoutInflater)
//
//    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_verizon, container, false)

        return rootView
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//
//
//        super.onViewCreated(view, savedInstanceState)
//        val button: Button = view.findViewById(R.id.start_button)
//        button?.setOnClickListener {
//            findNavController().navigate(R.id.action_verizonFragment_to_signInActivity, null)
//        }
//
//    }
}