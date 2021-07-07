package com.example.rendszm

import org.junit.Test

import org.junit.Assert.*

class LicencePlateCheckTest {
    val checker = LicencePlateCheck()
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
    fun validTest(){
        assertTrue(checker.check("ABC-123"))
        assertTrue(checker.check("abc-123"))
    }

    @Test
    fun validNewTest(){
        assertTrue(checker.check("AB-CD-012"))
    }
}