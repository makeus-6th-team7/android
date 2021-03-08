package com.example.myapplication.makeus.ui.view.filter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : AppCompatActivity() {

    var spinnerItems = arrayOf("모든 날짜","지난 1시간","지난 1일","지난 1주","지난 1개월","지난 1년")
    val spinner = findViewById<Spinner>(R.id.filter_spinner)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        setSpinner()
        setButton()
    }

    private fun setButton() {
        val btn_back = findViewById<ImageButton>(R.id.ib_setting_back)
        btn_back.setOnClickListener{
            finish()
        }

        val btn_apply = findViewById<Button>(R.id.btn_apply)
        btn_apply.setOnClickListener {
            //TODO: 필터 적용해서 값 보여주기
            finish()
        }

        val btn_reset = findViewById<Button>(R.id.btn_reset)
        btn_reset.setOnClickListener {
            spinner.setSelection(0)
            //seekBar.setProgressBar(0)
        }
    }

    private fun setSpinner() {
        var adapter = ArrayAdapter(this,R.layout.item_spinner,spinnerItems)

        spinner.adapter = adapter
        spinner.setSelection(0)

        spinner.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position){
                    0->{
                        //모든 날짜
                    }
                    1 ->{
                        //지난 1시간
                    }
                    2 -> {
                        //지난 1일
                    }
                    3 ->{
                        //지난 1주
                    }
                    4->{
                        //지난 한달
                    }
                    5 ->{
                        //지난 일년
                    }
                }
            }
        }
    }
}
