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
    fun checkText() {
        val activity = Robolectric.setupActivity(MainActivity::class.java!!)

        val text = activity.findViewById(R.id.text) as TextView

        assertThat(text.text.toString(), IsEqual.equalTo("Hello World!"))
    }
}