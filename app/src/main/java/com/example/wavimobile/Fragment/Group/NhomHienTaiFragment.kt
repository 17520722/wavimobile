package com.example.wavimobile.Fragment.Group

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.GroupHienTaiAdapter
import com.example.wavimobile.Models.NhomHienTai
import com.example.wavimobile.R
import kotlinx.android.synthetic.main.fragment_rcv.*

class NhomHienTaiFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rcv, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val list = create()
//        list.add(NhomHienTai(R.drawable.anh,"tên", 3))
//        list.add(NhomHienTai(R.drawable.anh,"tên", 4))
//        list.add(NhomHienTai(R.drawable.anh,"tên", 5))
//        list.add(NhomHienTai(R.drawable.anh,"tên", 6))
//        list.add(NhomHienTai(R.drawable.anh,"tên", 7))
//        list.add(NhomHienTai(R.drawable.anh,"tên", 8))

     //   rcv.adapter = GroupHienTaiAdapter(list)
     //   rcv.layoutManager = LinearLayoutManager(activity)
       // rcv.setHasFixedSize(true)

        // var groupHienTaiAdapter = GroupHienTaiAdapter(list)

//        rcv.run {
//            adapter = groupHienTaiAdapter
//            layoutManager = LinearLayoutManager(context)
//        }
    }

    fun create(): ArrayList<NhomHienTai> {

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