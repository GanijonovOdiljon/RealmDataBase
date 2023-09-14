package com.example.relamdatabase.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Note: RealmObject {
    @PrimaryKey
    var id : Long = 0
    var time: String? = null
    var note: String? = null

    constructor()
    constructor(id:Long,time:String?,note:String?):super(){
        this.id = id
        this.time = time
        this.note   = note
    }
}