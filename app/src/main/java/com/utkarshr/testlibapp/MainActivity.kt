package com.utkarshr.testlibapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.utkarshr.testlibrary.TestClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestClass.toast(this)

    }
}