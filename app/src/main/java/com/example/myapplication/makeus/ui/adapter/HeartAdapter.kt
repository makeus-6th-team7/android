package com.example.myapplication.makeus.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.com.example.myapplication.makeus.ui.App
import com.example.myapplication.R
import com.example.myapplication.com.example.myapplication.ui.view.heart.HeartDetailFragment
import com.example.myapplication.makeus.ui.view.heart.Image

class HeartAdapter(
    private var myHeartList: ArrayList<Image>
) : RecyclerView.Adapter<HeartAdapter.ViewHolder>() {

    private lateinit var view : View

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val img1 = itemView?.findViewById<ImageView>(R.id.iv_heart_item1)
        val img2 = itemView?.findViewById<ImageView>(R.id.iv_heart_item2)
        val img3 = itemView?.findViewById<ImageView>(R.id.iv_heart_item3)
        val img4 = itemView?.findViewById<ImageView>(R.id.iv_heart_item4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeartAdapter.ViewHolder {

        view = LayoutInflater.from(parent.context).inflate(R.layout.item_heart, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myHeartList.size
    }

    override fun onBindViewHolder(holder: HeartAdapter.ViewHolder, position: Int) {
        val list = myHeartList[position]

        for (i in 0..3) {
            when(i){
                0 ->{
                    Glide.with(App.instance)
                        .load(list.url[i])
                        .placeholder(R.drawable.ic_no_image)
                        .into(holder.img1!!)
                }
                1 ->{
                    Glide.with(App.instance)
                        .load(list.url[i])
                        .placeholder(R.drawable.ic_no_image)
                        .into(holder.img2!!)
                }
                2 ->{
                    Glide.with(App.instance)
                        .load(list.url[i])
                        .placeholder(R.drawable.ic_no_image)
                        .into(holder.img3!!)
                }
                3 ->{
                    Glide.with(App.instance)
                        .load(list.url[i])
                        .placeholder(R.drawable.ic_no_image)
                        .into(holder.img4!!)
                }
            }

        }

        holder.itemView.setOnClickListener {
            val activity = view.context as AppCompatActivity
            val transaction = activity.supportFragmentManager.beginTransaction()
            val heartDetailFragment: Fragment = HeartDetailFragment()

            transaction.replace(R.id.fl_container, heartDetailFragment)
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.commit()
        }


    }
}