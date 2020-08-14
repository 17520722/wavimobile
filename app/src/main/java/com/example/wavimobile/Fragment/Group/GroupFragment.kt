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
import com.example.wavimobile.TaoNhomActivity
import kotlinx.android.synthetic.main.fragment_group.*
import kotlinx.android.synthetic.main.fragment_group.rcv
import kotlinx.android.synthetic.main.fragment_rcv.*

class GroupFragment : Fragment() {
    var bNhomHienTai = true
    val colorSelected = "#FFFFFF"
    val colorHint = "#4F4F4F"
    var flag=0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_group, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcv.layoutManager = LinearLayoutManager(context)
        var list1 = ArrayList<NhomHienTai>()
        list1.add(NhomHienTai("Tên nhóm 1", 1))
        list1.add(NhomHienTai("Tên nhóm 2", 2))
        list1.add(NhomHienTai("Tên nhóm 3", 2))
        list1.add(NhomHienTai("Tên nhóm 4", 4))
        list1.add(NhomHienTai("Tên nhóm 5", 5))
        list1.add(NhomHienTai("Tên nhóm 6", 6))
        list1.add(NhomHienTai("Tên nhóm 7", 7))
        list1.add(NhomHienTai("Tên nhóm 8", 8))
        list1.add(NhomHienTai("Tên nhóm 9", 9))


        var list2 = ArrayList<NhomHienTai>()
        list2.add(NhomHienTai("Tên nhóm mời 1", 1))
        list2.add(NhomHienTai("Tên nhóm mời 2", 2))
        list2.add(NhomHienTai("Tên nhóm mời 3", 2))
        list2.add(NhomHienTai("Tên nhóm mời 4", 4))
        list2.add(NhomHienTai("Tên nhóm mời 5", 5))
        list2.add(NhomHienTai("Tên nhóm mời 6", 6))
        list2.add(NhomHienTai("Tên nhóm mời 7", 7))
        list2.add(NhomHienTai("Tên nhóm mời 8", 8))
        list2.add(NhomHienTai("Tên nhóm mời 9", 9))

        var adap1 = GroupHienTaiAdapter(list1)
        var adap2 = GroupLoiMoiAdapter(list2)

        if (flag==0)
        {
            rcv.adapter=adap1
            tv_NhomHienTai.setTextColor(Color.parseColor(colorSelected))
            tv_LoiMoi.setTextColor(Color.parseColor(colorHint))
        }
        else{
            rcv.adapter=adap2
            tv_NhomHienTai.setTextColor(Color.parseColor(colorHint))
            tv_LoiMoi.setTextColor(Color.parseColor(colorSelected))
        }
        rcv.setOnClickListener {
            //startActivity(Intent(context,ManHinhChinhNhomThanhVienActivity::class.java))
            Toast.makeText(context,"ákdgyusadfsa",Toast.LENGTH_LONG).show()
        }

        tv_NhomHienTai.setOnClickListener {
            if (!bNhomHienTai) {
                rcv.adapter = adap1
                rcv?.adapter?.notifyDataSetChanged()
                // makeCurrentFragment(NhomHienTaiFragment)
                tv_NhomHienTai.setTextColor(Color.parseColor(colorSelected))
                tv_LoiMoi.setTextColor(Color.parseColor(colorHint))
                flag=0
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
                flag=1
                bNhomHienTai = false
            }
        }
        btAdd.setOnClickListener{
            startActivity(Intent(this.requireContext(),TaoNhomActivity::class.java))
        }

    }
}