package com.utkarshr.testlibapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.utkarshr.testlibrary.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestClass.toast(this)

        Log.v("MainActivity", "TestClass")

    }
}