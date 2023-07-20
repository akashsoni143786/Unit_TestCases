package com.example.myapplication.utils

class Helper {
    fun isPallindrome(input: String): Boolean {
        val i = 0
        val j = input.length - 1
        var result = true
        while (i < j) {
            if (input[i] != input[j]) {
                result = false
                break
            }
        }

        return result
    }
   /* fun checkPassword(input: String) = when {
            input.isNullOrEmpty() ->{
                "Password is blank"
            }
        else ->{
            "Valid "
        }

        }*/

}