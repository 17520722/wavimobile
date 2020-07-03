package com.example.wavimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_man_hinh_chinh_su_kien.*

class ManHinhChinhSuKienActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh_chinh_su_kien)
        bt_back.setOnClickListener{
            onBackPressed()
        }
    }
}