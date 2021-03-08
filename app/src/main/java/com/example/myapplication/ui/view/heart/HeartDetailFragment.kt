package com.example.myapplication.com.example.myapplication.ui.view.heart

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.ui.view.filter.FilterActivity

class HeartDetailFragment : Fragment() {
    private lateinit var v: View
    private lateinit var back: ImageButton
    private lateinit var filter: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_heart_detail, container, false)

        setButton()

        return v
    }

    private fun setButton() {
        back = v.findViewById(R.id.ib_back_key)
        back.setOnClickListener {
            fragmentManager!!.popBackStack()
        }

        filter = v.findViewById(R.id.ib_heart_detail_filter)
        filter.setOnClickListener {
            activity?.let {
                val intent = Intent(context, FilterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}