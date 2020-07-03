package com.example.wavimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_thong_tin_nhom.*

class ThongTinNhomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thong_tin_nhom)
        bt_back.setOnClickListener {
            onBackPressed()
        }
    }
}