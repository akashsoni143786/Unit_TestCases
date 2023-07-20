package com.example.myapplication.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

private const val b = true

class HelperTest {

   @Before
   fun setUp(){
       println("Before every test cases")
   }

    @After
    fun tearDown()
    {
        println("After test cases")
    }

    @Test
    fun isPallindrome() {
        //Arrange
        val helper=Helper()
        // Act
        val result=helper.isPallindrome("level")
        // Assert
        assertEquals(true,result)

        val helper2=Helper()
        // Act
        val result2=helper2.isPallindrome("level")
        // Assert
        assertEquals(true,result)
        //asserte
    }


    @Test(expected = NullPointerException::class)
    fun isPallindrome_inputString_level_outputTrue() {
        //Arrange
        val helper=Helper()
        // Act
        val result=helper.isPallindrome("hellow")
        // Assert
        //asserte
    }
}