package com.viktor_zet.criminal_intent_p4.repository

import android.content.Context
import java.lang.IllegalStateException

class CrimeRepository private constructor(context: Context){

    companion object{
        private var INSTANCE: CrimeRepository?=null

        fun initialize(context: Context){
            if (INSTANCE ==null) INSTANCE = CrimeRepository(context)
        }
        fun get(): CrimeRepository {
            return INSTANCE ?:throw IllegalStateException("Crime repository must be initialized")
        }
    }
}