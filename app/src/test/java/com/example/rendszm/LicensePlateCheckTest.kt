package com.example.rendszm

import org.junit.Test

import org.junit.Assert.*

class LicensePlateCheckTest {
    val checker = LicensePlateCheck()

    @Test
    fun testEmpty() {
        assertFalse(checker.check(""))
    }

    @Test
    fun invalidTest() {
        assertFalse(checker.check("ALMA"))
        assertFalse(checker.check("ALM-ALM"))
        assertFalse(checker.check("000-000"))
        assertFalse(checker.check("ALMAALMA"))
        assertFalse(checker.check("ALMA-001"))
        assertFalse(checker.check("ALM-0213"))
    }

    @Test
    fun validTest() {
        assertTrue(checker.check("ABC-123"))
        assertTrue(checker.check("abc-123"))
    }

    @Test
    fun validNewTest() {
        assertTrue(checker.check("AB-CD-012"))
        assertTrue(checker.check("ab-cd-012"))
    }

    @Test
    fun invalidNewTest() {
        assertFalse(checker.check(""))
        assertFalse(checker.check("012345678"))
        assertFalse(checker.check("00-00-032"))
        assertFalse(checker.check("AA-AA-AAA"))
        assertFalse(checker.check("AAA-AA-AAA"))
        assertFalse(checker.check("AA-0-AAA"))
    }
}