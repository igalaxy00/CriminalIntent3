package com.bignerdranch.android.criminalintent3

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.criminalintent3.CrimeRepository

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val  crimeListLiveData = crimeRepository.getCrimes()
}