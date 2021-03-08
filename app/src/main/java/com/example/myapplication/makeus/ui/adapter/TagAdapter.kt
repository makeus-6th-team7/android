package com.example.myapplication.makeus.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class TagAdapter(private var TagsList: ArrayList<String>) :
    RecyclerView.Adapter<TagAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_tag ,parent, false))
    }

    override fun getItemCount(): Int {
        return TagsList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tags!!.text = TagsList[position]
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val tags = itemView?.findViewById<TextView>(R.id.tv_tag)
    }
}