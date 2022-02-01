package com.viktor_zet.criminal_intent_p4.database

import androidx.room.Dao
import androidx.room.Query
import com.viktor_zet.criminal_intent_p4.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT*FROM crime")
    fun getCrimes():List<Crime>
    @Query("SELECT*FROM crime WHERE id=(:id)")
    fun getCrime(id:UUID):Crime?
}