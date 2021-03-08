package com.example.myapplication.com.example.myapplication.makeus.ui

import android.app.Application

class App : Application() {

    companion object {
        lateinit var instance: App
            private set

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}