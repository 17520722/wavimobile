package com.example.wavimobile.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wavimobile.ManHinhChinhSuKienActivity
import com.example.wavimobile.Models.SuKien
import com.example.wavimobile.R

class EventQuanTamAdapter (val list: ArrayList<SuKien>) :
    RecyclerView.Adapter<EventQuanTamAdapter.ViewHolder>() {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_list_event_quantam, parent, false)
        context=parent.context
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.carItem.setOnClickListener {
            context.startActivity(Intent(context, ManHinhChinhSuKienActivity::class.java))
        }
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val carItem = itemView.findViewById<CardView>(R.id.cardEvent1)

    }

}