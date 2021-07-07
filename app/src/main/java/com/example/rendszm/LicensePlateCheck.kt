package com.example.rendszm

import java.util.regex.Pattern

class LicensePlateCheck {
    private val rules = listOf(
        "^[A-Za-z]{3}-[0-9]{3}$",
        "[A-Za-z ]{2}-[A-Za-z ]{2}-[0-9]{3}"
    )

    fun check(text: String) = rules.any { Pattern.matches(it, text) }
}