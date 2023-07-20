package com.example.myapplication

import com.example.myapplication.utils.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterizedExample(val input:String,val expectedValue:Boolean) {

    @Test
    fun test(){
        val helper= Helper();
        val result=helper.isPallindrome(input)
        assertEquals(result,expectedValue)
    }


    companion object{
        @JvmStatic
        @Parameters(name = "{index} : {0} is palandrom {1}")
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("Hello",false),
                arrayOf("level",true),
                arrayOf("akash",false),
                arrayOf("mamam",true)
            )
        }

    }
}