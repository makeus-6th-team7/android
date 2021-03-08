package com.example.myapplication.com.example.myapplication.ui.view.heart

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class HeartDetailFragment : Fragment() {
    private lateinit var v : View
    private lateinit var back : ImageButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        v =   inflater.inflate(R.layout.fragment_heart_detail, container, false)
        back = v.findViewById(R.id.ib_back_key)
        back.setOnClickListener {
            fragmentManager!!.popBackStack()
        }
        return v
    }


}