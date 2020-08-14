package com.example.wavimobile.Adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.ColorMatrix
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wavimobile.ManHinhChinhSuKienActivity
import com.example.wavimobile.Models.SuKien
import com.example.wavimobile.R

class BXHAdapter (val list: ArrayList<SuKien>) :
    RecyclerView.Adapter<BXHAdapter.ViewHolder>() {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_list_bxh, parent, false)
        context=parent.context
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.stt.text=(position+1).toString()
        holder?.ten.text="Tên thành viên " +(position+1)
        if (position==11)
            holder?.ten.text="Bạn"

    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val stt = itemView.findViewById<TextView>(R.id.stt)
        val ten = itemView.findViewById<TextView>(R.id.txt_tenTV)
    }

}