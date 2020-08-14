package com.example.wavimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.VideoAdapter
import com.example.wavimobile.Models.SuKien
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_nhom_thanh_vien.*
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_su_kien.*
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_su_kien.bt_back
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_su_kien.rcv

class ManHinhChinhSuKienActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh_chinh_su_kien)
        bt_back.setOnClickListener{
            onBackPressed()
        }
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

        var adap1 = VideoAdapter(list1)
        rcv.run {
            adapter=adap1
            layoutManager= LinearLayoutManager(context)
        }
    }
}