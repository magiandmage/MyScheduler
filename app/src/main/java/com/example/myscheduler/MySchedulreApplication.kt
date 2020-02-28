package com.example.myscheduler

class MySchedulreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}