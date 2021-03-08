package com.example.myapplication.makeus.ui.view.filter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.makeus.ui.adapter.TagAdapter
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : AppCompatActivity() {

    var spinnerItems = arrayOf("모든 날짜","지난 1시간","지난 1일","지난 1주","지난 1개월","지난 1년")
    var TagList1 = arrayListOf("뷰 좋음","서비스 좋음","어메니티 좋음","주차 공간 넓음","조식 제공","매우 깨끗","방음 잘됨")
    var TagList2 = arrayListOf("사진과 다름","화장실 더러움","개별 화장실 없음","청결안좋음","방음 안됨","온수 안나옴","방이 차가움")
    private lateinit var  spinner : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)


        setSpinner()
        setButton()
        setPositiveTag()
        setNagativeTag()
    }

    private fun setNagativeTag() {
        val rv_positive = findViewById<RecyclerView>(R.id.rv_positive)
        val positiveAdapter = TagAdapter(TagList1)
        rv_positive.layoutManager =
            GridLayoutManager(this, 5)
        rv_positive.adapter = positiveAdapter
    }

    private fun setPositiveTag() {
        val rv_nagative = findViewById<RecyclerView>(R.id.rv_nagative)
        val nagativeAdapter = TagAdapter(TagList2)
        rv_nagative.layoutManager =
            GridLayoutManager(this, 5)
        rv_nagative.adapter = nagativeAdapter
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
        spinner = findViewById(R.id.filter_spinner)
        spinner.adapter = adapter
        spinner.setSelection(0)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                println("")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
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
