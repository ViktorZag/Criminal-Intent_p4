package com.viktor_zet.criminal_intent_p4

import androidx.lifecycle.ViewModel
import com.viktor_zet.criminal_intent_p4.repository.CrimeRepository

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}