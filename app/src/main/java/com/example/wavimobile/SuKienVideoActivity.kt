package com.example.wavimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavimobile.Adapter.VideoAdapter
import com.example.wavimobile.Models.SuKien
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_su_kien.*

class SuKienVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_su_kien_video)
        bt_back.setOnClickListener{
            onBackPressed()
        }
        val text=intent.getStringExtra("text")
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
        textSoNguoiTG.text=text
        var adap1 = VideoAdapter(list1)
        rcv.run {
            adapter=adap1
            layoutManager= LinearLayoutManager(context)
        }
        bxh.setOnClickListener{
            val intent = Intent(this, BXHActivity::class.java)
            startActivity(intent)
        }
    }
}