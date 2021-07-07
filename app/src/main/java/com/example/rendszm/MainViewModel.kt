package com.example.rendszm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val license_plate = MutableLiveData<String>()
    val output = MutableLiveData<String>()

    fun onSend() {
        license_plate.value?.let {
            if (LicensePlateCheck().check(it)) {
                output.value = "A(z) ${license_plate.value} helyes"
            } else {
                output.value = "A(z) ${license_plate.value} hibás"
            }
        }
    }

}

