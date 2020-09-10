package com.anthonyh.cellprojectfirebase

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import com.anthonyh.cellprojectfirebase.databinding.ActivityMainBinding
import com.anthonyh.cellprojectfirebase.fragment.VerizonFragment
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : BaseActivity() {

    private lateinit var pagerAdapter: FragmentPagerAdapter
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        pagerAdapter = object : FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
            private val fragments = arrayOf(
                VerizonFragment()
//                    RecentPostsFragment(),
//                    MyPostsFragment(),
//                    MyTopPostsFragment()
            )

            private val fragmentNames = arrayOf(

                "Recent"
//                    getString(R.string.heading_my_posts),
//                    getString(R.string.heading_my_top_posts)
            )
            override fun getItem(position: Int): Fragment {
                return fragments[position]
            }

            override fun getCount() = fragments.size

            override fun getPageTitle(position: Int): CharSequence? {
                return fragmentNames[position]
            }
    }
        // Set up the ViewPager with the sections adapter.
        with(binding) {
            container.adapter = pagerAdapter

            tabs.setupWithViewPager(container)

//            // Button launches NewPostActivity
//            fabNewPost.setOnClickListener {
//                startActivity(Intent(this@MainActivity, SignInActivity::class.java))
//            }
        }
}
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.action_logout) {
            Firebase.auth.signOut()
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }

}