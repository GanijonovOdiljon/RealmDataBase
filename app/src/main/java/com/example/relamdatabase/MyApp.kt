package com.example.relamdatabase

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApp: Application () {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val configurafion = RealmConfiguration.Builder()
            .allowWritesOnUiThread(true)
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(1)
            .build()
        Realm.setDefaultConfiguration(configurafion)
    }
}