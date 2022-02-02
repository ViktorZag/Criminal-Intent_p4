package com.viktor_zet.criminal_intent_p4.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.viktor_zet.criminal_intent_p4.model.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List <Crime> >

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData <Crime?>
}