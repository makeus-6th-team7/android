package com.example.myapplication.ui.view.search

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TableLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.ui.adapter.SearchMultiAdapter
import com.example.myapplication.ui.view.filter.FilterActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    private lateinit var v : View
    private var allList = ArrayList<String>()
    private var placeList = ArrayList<String>()
    private var tagList = ArrayList<String>()

    private lateinit var rv_search : RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_search, container, false)


        filterButton()
        return v
    }

    private fun filterButton() {
        val ib_filter = v.findViewById<ImageButton>(R.id.ib_filter)
        ib_filter.setOnClickListener {
            activity?.let{
                val intent = Intent(context, FilterActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun TabLayout.addOnTabSelectedListener() {
        when(selectedTabPosition){
            0 -> {
                allList.clear()
                allList.add("강릉 네이처")
                allList.add("강릉 굿플레이스")
                allList.add("강릉 새벽정원")
                rv_search = v.findViewById(R.id.rv_search_result)
                rv_search.adapter = SearchMultiAdapter(1,allList)
                Log.d("여기는 탭 응답하라 오버","${selectedTabPosition}이 응답했다 오바")
            }
            1 -> {
                allList.clear()
                allList.add("강릉 네이처")
                allList.add("강릉 굿플레이스")
                allList.add("강릉 새벽정원")
                rv_search = v.findViewById(R.id.rv_search_result)
                rv_search.adapter = SearchMultiAdapter(2,allList)
                Log.d("여기는 탭 응답하라 오버","${selectedTabPosition}이 응답했다 오바")

            }
            3 -> {

            }
        }
    }

}

private fun TabLayout.setOnTabSelectedListener() {
    TODO("Not yet implemented")
}

