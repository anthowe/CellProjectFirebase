package com.anthonyh.cellprojectfirebase.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.anthonyh.cellprojectfirebase.R
import com.anthonyh.cellprojectfirebase.databinding.ActivityMainBinding.inflate
import com.anthonyh.cellprojectfirebase.databinding.FragmentNextBinding
import com.anthonyh.cellprojectfirebase.databinding.FragmentVerizonBinding.inflate


class NextFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val text = view.findViewById<TextView>(R.id.textView3)
//        text?.setOnClickListener { findNavController().navigate(R.id.action_nextFragment_to_secondFragment) }
    }
}