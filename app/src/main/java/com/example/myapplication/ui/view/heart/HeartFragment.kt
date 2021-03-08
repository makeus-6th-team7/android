package com.example.myapplication.ui.view.heart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.ui.adapter.HeartAdapter

class HeartFragment : Fragment() {

    private lateinit var v : View
    private var myHeartList = ArrayList<Image>()
    private var smallList = ArrayList<String>()
    private lateinit var rv_my_heart : RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v =  inflater.inflate(R.layout.fragment_heart, container, false)

        setMyHeartList()
        return v
    }

    private fun setMyHeartList() {
        myHeartList.clear()
        smallList.add("https://photo.jtbc.joins.com/news/2019/06/05/20190605181614181.jpg")
        smallList.add("https://cf.bstatic.com/images/hotel/max1024x768/257/257205429.jpg")
        smallList.add("https://cf.bstatic.com/images/hotel/max1024x768/257/257205403.jpg")
        smallList.add("https://cf.bstatic.com/images/hotel/max1024x768/257/257205403.jpg")
        myHeartList.add(Image(smallList))
        myHeartList.add(Image(smallList))
        myHeartList.add(Image(smallList))

        rv_my_heart = v.findViewById(R.id.rv_heart)
        rv_my_heart.layoutManager = GridLayoutManager(context, 2)
        rv_my_heart.adapter = HeartAdapter(myHeartList)
    }



}

data class Image(val url: ArrayList<String>){
}