package com.example.myapplication.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.ui.view.heart.HeartFragment
import com.example.myapplication.ui.view.home.HomeFragment
import com.example.myapplication.ui.view.search.SearchFragment
import com.example.myapplication.ui.view.setting.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment : HomeFragment by lazy { HomeFragment() }
    private val searchFragment : SearchFragment by lazy { SearchFragment() }
    private val heartFragment : HeartFragment by lazy { HeartFragment() }
    private val settingFragment : SettingFragment by lazy { SettingFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBottomNavigation()

    }

    private fun initBottomNavigation() {
        bnv_home.run {
            setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.nav_home ->{
                        setFragment(homeFragment)
                    }
                    R.id.nav_search -> {
                        setFragment(searchFragment)
                    }
                    R.id.nav_plus -> {

                    }
                    R.id.nav_heart ->{
                        setFragment(heartFragment)
                    }
                    R.id.nav_user -> {
                        setFragment(settingFragment)
                    }
                }
                true
            }
            selectedItemId = R.id.home // 초기 프래그먼트
        }
    }


    //fragment 전환 함수
    private fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
    }

}

