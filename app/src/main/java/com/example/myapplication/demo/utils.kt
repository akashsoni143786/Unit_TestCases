package com.example.myapplication.demo

class utils {
    fun checkSum(input:String):Boolean{
        var result=true
        if (input.isNullOrEmpty())
            result=false
        return result

    }
}