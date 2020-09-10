package com.anthonyh.cellprojectfirebase

import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.anthonyh.cellprojectfirebase.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view: View ->
            findNavController(R.navigation.navigation).navigate(R.id.action_verizonFragment_to_mainActivity)
        }
    }
}

//{ view ->
//    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//        .setAction("Action", null).show()
//}