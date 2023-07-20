package com.example.myapplication

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.*
import org.junit.Rule

import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule= activityScenarioRule<MainActivity>()



    @Test
    fun buttonClickTest() {
        val name="Rohit"
        onView(withId(R.id.editTextTextPersonName)).perform(typeText(name))
        onView(withId(R.id.editTextTextPersonName2)).perform(typeText("Detail"))
        //closeSoftKeyboard()
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText(name)))
    }
}