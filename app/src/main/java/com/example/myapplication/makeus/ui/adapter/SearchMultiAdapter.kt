package com.example.myapplication.makeus.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class SearchMultiAdapter(
    private var type: Int,
    private var ItemsList: ArrayList<String>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var view : View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.search_all_item, parent, false)
                AllViewHolder(view)
            }
            2 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.search_tag_item, parent, false)
                TagViewHolder(view)
            }
            3 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.search_place_item, parent, false)
                PlaceViewHolder(view)
            }
            else -> throw RuntimeException("알 수 없는 뷰 타입 에러")
        }
    }

    override fun getItemCount(): Int {
        return ItemsList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(type){
            1 -> {
                (holder as AllViewHolder).tv_room_name.text = ItemsList[position]
            }
            2 -> {
                (holder as TagViewHolder).tv_tag_name.text = ItemsList[position]
            }
            3 -> {

            }
        }
    }

    inner class AllViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_room_name = itemView.findViewById<TextView>(R.id.tv_room_name)
    }

    inner class TagViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_tag_name = itemView.findViewById<TextView>(R.id.tv_search_tag)
    }

    inner class PlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}
