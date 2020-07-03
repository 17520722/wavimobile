package com.example.wavimobile.Fragment.Event

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.EventNoiBatAdapter
import com.example.wavimobile.Adapter.EventQuanTamAdapter
import com.example.wavimobile.Adapter.GroupHienTaiAdapter
import com.example.wavimobile.Adapter.GroupLoiMoiAdapter
import com.example.wavimobile.ManHinhChinhNhomThanhVienActivity
import com.example.wavimobile.ManHinhChinhSuKienActivity
import com.example.wavimobile.Models.NhomHienTai
import com.example.wavimobile.Models.SuKien
import com.example.wavimobile.R
import kotlinx.android.synthetic.main.fragment_event.*
import kotlinx.android.synthetic.main.fragment_event.rcv
import kotlinx.android.synthetic.main.fragment_group.*

class EventFragment : Fragment() {
    var bNoiBat = true
    val colorSelected = "#FFFFFF"
    val colorHint = "#4F4F4F"
    var flag = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //   makeCurrentFragment(noiBatFragment)


        rcv.layoutManager = LinearLayoutManager(context)
        var list1 = ArrayList<SuKien>()
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))
        list1.add(SuKien("", "", 0))


        var list2 = ArrayList<SuKien>()
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))
        list2.add(SuKien("", "", 0))

        var adap1 = EventNoiBatAdapter(list1)
        var adap2 = EventQuanTamAdapter(list2)

        if (flag == 0) {
            rcv.adapter = adap1
        }
        tv_eNoiBat.setOnClickListener {
            if (!bNoiBat) {
                //   makeCurrentFragment(noiBatFragment)
                rcv.adapter = adap1
                rcv?.adapter?.notifyDataSetChanged()
                tv_eNoiBat.setTextColor(Color.parseColor(colorSelected))
                tv_eQuanTam.setTextColor(Color.parseColor(colorHint))
                bNoiBat = true
            }
        }
        tv_eQuanTam.setOnClickListener {
            if (bNoiBat) {
                //  makeCurrentFragment(quanTamFragment)
                rcv.adapter = adap2
                rcv?.adapter?.notifyDataSetChanged()
                tv_eNoiBat.setTextColor(Color.parseColor(colorHint))
                tv_eQuanTam.setTextColor(Color.parseColor(colorSelected))
                bNoiBat = false
            }
        }
    }
}