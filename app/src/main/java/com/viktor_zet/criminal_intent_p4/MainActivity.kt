package com.viktor_zet.criminal_intent_p4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viktor_zet.criminal_intent_p4.repository.CrimeRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            val fragment = CrimeListFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
        CrimeRepository.initialize(this)

    }

}