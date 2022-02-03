package com.viktor_zet.criminal_intent_p4.view_model

import androidx.lifecycle.ViewModel
import com.viktor_zet.criminal_intent_p4.model.Crime
import com.viktor_zet.criminal_intent_p4.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}