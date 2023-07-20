package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTesttemo {
// First launch this activity then execute any test case
    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()


    //@Test(expected = FileNotFoundException::class)
    @Test
    fun testUiDemo() {
        /*
                val context=ApplicationProvider.getApplicationContext<Context>()
        Intents.init()
        val expected=allOf(hasAction(Intent.ACTION_VIEW))
        intended(expected)
                onView(withId(R.id.editTextTextPersonName)).check(matches(withText("fdsfdfs"))
*/

        onView(withId(R.id.editTextTextPersonName)).perform(typeText("Hello name"))
        onView(withId(R.id.editTextTextPersonName2)).perform(typeText("Desciption"),
            closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("Akash Soni")))
    }


}