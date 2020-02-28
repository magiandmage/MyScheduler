package com.example.myscheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm

class SchedulerEditActivity : AppCompatActivity() {
    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shedule_edit)
        realm = Realm.getDefaultInstance()

        save.setOnClicListener { view: View ->
            realm.executeTransaction { db: Realm ->}
                val maxId = db.where<Shedule>().max("id")
                val nextId = (maxId?.toLong)

        }
    }
}
