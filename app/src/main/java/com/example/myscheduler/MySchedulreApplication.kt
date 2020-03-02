package com.example.myscheduler

import android.app.Application
import io.realm.Realm

class MySchedulreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}