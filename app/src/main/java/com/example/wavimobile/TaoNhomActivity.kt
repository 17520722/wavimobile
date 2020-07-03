package com.example.wavimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_tao_nhom.*

class TaoNhomActivity : AppCompatActivity() {
    var moRong=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tao_nhom)
        bt_back.setOnClickListener {
            onBackPressed()
        }
        tvMoRong.setOnClickListener{
                edQuyenRiengTu.visibility= View.VISIBLE
                edMota.visibility= View.VISIBLE
                tvMoRong.visibility= View.GONE
                tvThunho.visibility= View.VISIBLE
                moRong=false
        }
        tvThunho.setOnClickListener {

                edQuyenRiengTu.visibility= View.GONE
                edMota.visibility= View.GONE
                tvMoRong.visibility= View.VISIBLE
                tvThunho.visibility= View.GONE
                moRong=true

        }
        bt_Tao.setOnClickListener{
            startActivity(Intent(this@TaoNhomActivity,ManHinhChinhSuKienActivity::class.java))
        }
    }
}