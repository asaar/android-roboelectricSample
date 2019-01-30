package com.pramonow.unittestingtest

import android.support.test.espresso.matcher.ViewMatchers.assertThat
import android.widget.TextView
import org.hamcrest.core.IsEqual.equalTo
import org.robolectric.Robolectric
import org.junit.Test
import org.robolectric.RobolectricTestRunner
import org.junit.runner.RunWith

@RunWith(RobolectricTestRunner::class)
class MainTest {
    @Test
    fun checkText() {
        val activity = Robolectric.setupActivity(MainActivity::class.java!!)

        val text = activity.findViewById(R.id.text) as TextView

        assertThat(text.text.toString(), equalTo("Testing Android Rocks!"))
    }
}