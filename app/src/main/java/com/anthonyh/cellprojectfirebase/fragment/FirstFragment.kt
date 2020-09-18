package com.anthonyh.cellprojectfirebase.fragment

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.*
import android.view.View.inflate
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.anthonyh.cellprojectfirebase.R
import com.anthonyh.cellprojectfirebase.SignInActivity
import com.anthonyh.cellprojectfirebase.databinding.ActivityFirstBinding.inflate
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class FirstFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val attImage = view.findViewById<ImageView>(R.id.attImage)
        attImage?.setOnClickListener { findNavController().navigate(R.id.secondFragment, null) }

        val verizonImage = view.findViewById<ImageView>(R.id.verizonImage)
        verizonImage?.setOnClickListener { findNavController().navigate(R.id.thirdFragment, null) }
    }






}