package com.example.wavimobile.Fragment.Event

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wavimobile.R
import kotlinx.android.synthetic.main.fragment_event.*

class EventFragment : Fragment() {
    var bNoiBat = true
    val noiBatFragment= NoiBatFragment()
    val quanTamFragment=QuanTamFragment()
    val colorSelected= "#FFFFFF"
    val colorHint="#4F4F4F"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     //   makeCurrentFragment(noiBatFragment)
        tv_eNoiBat.setOnClickListener {
            if(!bNoiBat)
            {
             //   makeCurrentFragment(noiBatFragment)
                tv_eNoiBat.setTextColor(Color.parseColor(colorSelected))
                tv_eQuanTam.setTextColor(Color.parseColor(colorHint))
                bNoiBat=true
            }
        }
        tv_eQuanTam.setOnClickListener {
            if(bNoiBat)
            {
              //  makeCurrentFragment(quanTamFragment)
                tv_eNoiBat.setTextColor(Color.parseColor(colorHint))
                tv_eQuanTam.setTextColor(Color.parseColor(colorSelected))
                bNoiBat=false
            }
        }

    }

}