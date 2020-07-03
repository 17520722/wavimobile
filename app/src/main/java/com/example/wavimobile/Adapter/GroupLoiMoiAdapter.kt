package com.example.wavimobile.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wavimobile.Models.NhomHienTai
import com.example.wavimobile.R

class GroupLoiMoiAdapter (val list: ArrayList<NhomHienTai>) : RecyclerView.Adapter<GroupLoiMoiAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_group_loimoi, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var nhom: NhomHienTai =list[position]
        holder?.tvName.text=nhom.name

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tV_Name_loimoi)
     //   val btChapNhan = itemView.findViewById<Button>(R.id.bt_ChapNhan)
    //    val btTuChoi = itemView.findViewById<Button>(R.id.bt_TuChoi)
    }
}