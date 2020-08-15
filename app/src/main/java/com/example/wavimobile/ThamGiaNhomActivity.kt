package com.example.wavimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.VideoAdapter
import com.example.wavimobile.Models.SuKien
import kotlinx.android.synthetic.main.activity_tham_gia_nhom.*


class ThamGiaNhomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tham_gia_nhom)
        linear_nhom.setOnClickListener {
            startActivity(Intent(this, ThongTinNhomActivity::class.java))

        }
        bt_back.setOnClickListener {
            onBackPressed()
        }
        bt_thamGia.setOnClickListener{
            startActivity(Intent(this,ManHinhChinhNhomThanhVienActivity::class.java))
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
            adapter = adap1
            layoutManager = LinearLayoutManager(context)
        }
    }
}