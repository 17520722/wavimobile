package com.example.wavimobile.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.wavimobile.Fragment.Group.GroupFragment
import com.example.wavimobile.Fragment.Group.NhomHienTaiFragment
import com.example.wavimobile.ManHinhChinhNhomThanhVienActivity
import com.example.wavimobile.Models.NhomHienTai
import com.example.wavimobile.R
import kotlinx.android.synthetic.main.item_group_hientai.view.*

class GroupHienTaiAdapter(val list: ArrayList<NhomHienTai>) :
    RecyclerView.Adapter<GroupHienTaiAdapter.ViewHolder>() {

    lateinit var context:Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_group_hientai, parent, false)
        context=parent.context
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var nhom: NhomHienTai = list[position]
        holder?.tvName.text = nhom.name
        holder?.tvSoVideo.text = "Có " + nhom.soVideo.toString() + " video mới"
        holder?.carItem.setOnClickListener {
            context.startActivity(Intent(context,ManHinhChinhNhomThanhVienActivity::class.java))
        }
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tV_Name)
        val tvSoVideo = itemView.findViewById<TextView>(R.id.tV_SoVideo)
        val carItem = itemView.findViewById<CardView>(R.id.item_group)

    }

}