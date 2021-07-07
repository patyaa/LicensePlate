package com.example.rendszm

import androidx.lifecycle.MutableLiveData

class LicencePlateCheck {

    fun check(text: String): Boolean {
        var i = 0
        var goodInput = true

        if (text.length != 7) {
            goodInput = false
        }
        while (i < 7 && goodInput) {
            while (i < 3) {
                if (!text[i].isLetter()) {
                    goodInput = false
                }
                i += 1
            }
            if (i == 3) {
                if (text[i] != '-') {
                    goodInput = false
                }
                i += 1
            }
            while (i < 7 && goodInput) {
                if (!text[i].isDigit()) {
                    goodInput = false
                }
                i += 1
            }
        }
        return goodInput
    }
}