package com.example.wavimobile.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wavimobile.ManHinhChinhSuKienActivity
import com.example.wavimobile.Models.SuKien
import com.example.wavimobile.R

class EventNoiBatAdapter(val list: ArrayList<SuKien>) :
    RecyclerView.Adapter<EventNoiBatAdapter.ViewHolder>() {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_list_event_noibat, parent, false)
        context=parent.context
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var nhom: SuKien = list[position]
        holder?.carItem.setOnClickListener {
            val intent = Intent(context, ManHinhChinhSuKienActivity::class.java)
            intent.putExtra("text","100 người đã tham gia")
            context.startActivity(intent)

        }
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val carItem = itemView.findViewById<CardView>(R.id.cardEvent)

    }

}