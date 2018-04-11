package edu.washington.bennyn.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val tag: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(tag, "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }
}
