package com.example.wavimobile.Fragment.Group

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.GroupHienTaiAdapter
import com.example.wavimobile.Adapter.GroupLoiMoiAdapter
import com.example.wavimobile.ManHinhChinhNhomThanhVienActivity
import com.example.wavimobile.Models.NhomHienTai
import com.example.wavimobile.R
import kotlinx.android.synthetic.main.fragment_group.*
import kotlinx.android.synthetic.main.fragment_group.rcv
import kotlinx.android.synthetic.main.fragment_rcv.*

class GroupFragment : Fragment() {
    var bNhomHienTai = true

    val colorSelected = "#FFFFFF"
    val colorHint = "#4F4F4F"
    var flag=0

    //    private val a: GroupHienTaiAdapter by lazy {
//        GroupHienTaiAdapter(this@GroupFragment, mutableListOf())
//    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_group, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //   rcv.setHasFixedSize(true)

        rcv.layoutManager = LinearLayoutManager(context)
        var list1 = ArrayList<NhomHienTai>()
        list1.add(NhomHienTai("tên 1", 1))
        list1.add(NhomHienTai("tên 2", 2))
        list1.add(NhomHienTai("tên 3", 2))
        list1.add(NhomHienTai("tên 4", 4))
        list1.add(NhomHienTai("tên 5", 5))
        list1.add(NhomHienTai("tên 6", 6))
        list1.add(NhomHienTai("tên 7", 7))
        list1.add(NhomHienTai("tên 8", 8))
        list1.add(NhomHienTai("tên 9", 9))


        var list2 = ArrayList<NhomHienTai>()
        list2.add(NhomHienTai("Lời mời 1", 1))
        list2.add(NhomHienTai("Lời mời 2", 2))
        list2.add(NhomHienTai("Lời mời 3", 2))
        list2.add(NhomHienTai("Lời mời 4", 4))
        list2.add(NhomHienTai("Lời mời 5", 5))
        list2.add(NhomHienTai("Lời mời 6", 6))
        list2.add(NhomHienTai("Lời mời 7", 7))
        list2.add(NhomHienTai("Lời mời 8", 8))
        list2.add(NhomHienTai("Lời mời 9", 9))

        var adap1 = GroupHienTaiAdapter(list1)
        var adap2 = GroupLoiMoiAdapter(list2)


//        if (bNhomHienTai) {
//
//        } else {
//
//        }
        if (flag==0)
        {
            rcv.adapter=adap1
        }
        rcv.setOnClickListener {
            //startActivity(Intent(context,ManHinhChinhNhomThanhVienActivity::class.java))
            Toast.makeText(context,"ákdgyusadfsa",Toast.LENGTH_LONG).show()
        }

        tv_NhomHienTai.setOnClickListener {
            if (!bNhomHienTai) {
                startActivity(Intent(context,ManHinhChinhNhomThanhVienActivity::class.java))

                rcv.adapter = adap1
                rcv?.adapter?.notifyDataSetChanged()
                // makeCurrentFragment(NhomHienTaiFragment)
                tv_NhomHienTai.setTextColor(Color.parseColor(colorSelected))
                tv_LoiMoi.setTextColor(Color.parseColor(colorHint))
                bNhomHienTai = true
            }
        }
        tv_LoiMoi.setOnClickListener {
            if (bNhomHienTai) {

                rcv.adapter = adap2
                rcv?.adapter?.notifyDataSetChanged()
                //  makeCurrentFragment(loiMoiFragment)
                tv_NhomHienTai.setTextColor(Color.parseColor(colorHint))
                tv_LoiMoi.setTextColor(Color.parseColor(colorSelected))
                bNhomHienTai = false
            }
        }


    }

    //    private fun makeCurrentFragment(frag: Fragment) =
//        childFragmentManager.beginTransaction().apply {
//            replace(R.id.frameLayoutGroup, frag)
//            commit()
//        }
    private fun create(): ArrayList<NhomHienTai> {

        var list = ArrayList<NhomHienTai>()
        list.add(NhomHienTai("tên", 2))
        list.add(NhomHienTai("tênaaaaaaaaaaaaa", 3))
        list.add(NhomHienTai("têaaaaaaaaaan", 4))
        list.add(NhomHienTai("têaaaan", 5))
        list.add(NhomHienTai("têaan", 6))
        list.add(NhomHienTai("tên", 7))
        return list
    }
}