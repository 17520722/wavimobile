package com.example.wavimobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.wavimobile.Fragment.Event.EventFragment
import com.example.wavimobile.Fragment.FrofileFragment
import com.example.wavimobile.Fragment.Group.GroupFragment
import com.example.wavimobile.Fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val homeFragment = HomeFragment()
    val profileFragment = FrofileFragment()
    val eventFragment = EventFragment()
    val groupFragment = GroupFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeCurrentFragment(homeFragment)
        bottom_navigaion_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.fragment_home -> makeCurrentFragment(homeFragment)
                R.id.fragment_group -> makeCurrentFragment(groupFragment)
                R.id.fragment_event -> makeCurrentFragment(eventFragment)
                R.id.fragment_profile -> makeCurrentFragment(profileFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(frag: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, frag)
            commit()
        }
}
