package com.viktor_zet.criminal_intent_p4.model

import androidx.room.*

import java.util.*

@Entity
data class Crime(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
    var suspect: String = ""
) {
    val photoFileName
    get()="IMG_$id.jpg"
}