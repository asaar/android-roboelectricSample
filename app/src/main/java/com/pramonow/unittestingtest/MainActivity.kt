package com.pramonow.unittestingtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/*
    Activity declared to be setup by roboelectric
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
