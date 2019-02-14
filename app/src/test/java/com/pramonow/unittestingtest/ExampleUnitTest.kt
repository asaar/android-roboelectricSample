package com.pramonow.unittestingtest

import android.widget.TextView
import org.hamcrest.core.IsEqual
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {
    @Test
    fun checkFirstText() {
        val activity = Robolectric.setupActivity(MainActivity::class.java!!)
        val textRobo = activity.findViewById<TextView>(R.id.text_1)
        assertThat(textRobo.text.toString(), IsEqual.equalTo("Roboelectric")) //will pass
    }

    @Test
    fun checkSecondText() {
        val activity = Robolectric.setupActivity(MainActivity::class.java!!)
        val textTwo = activity.findViewById<TextView>(R.id.text_2)
        assertThat(textTwo.text.toString(), IsEqual.equalTo("False typo")) //will fail
    }
}