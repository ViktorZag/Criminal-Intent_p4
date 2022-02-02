package com.viktor_zet.criminal_intent_p4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.viktor_zet.criminal_intent_p4.repository.CrimeRepository
import java.util.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), CrimeListFragment.Callbacks {

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
    }

    override fun onCrimeSelected(crimeId: UUID) {
        val fragment = CrimeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

}