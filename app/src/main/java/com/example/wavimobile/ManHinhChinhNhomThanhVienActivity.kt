package com.example.wavimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_nhom_thanh_vien.*

class ManHinhChinhNhomThanhVienActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh_chinh_nhom_thanh_vien)
        linear_nhom.setOnClickListener{
            startActivity(Intent(this,ThongTinNhomActivity::class.java))
        }
    }
}