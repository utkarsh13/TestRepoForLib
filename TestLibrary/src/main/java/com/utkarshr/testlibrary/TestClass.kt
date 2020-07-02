package com.utkarshr.testlibrary

import android.content.Context
import android.widget.Toast

class TestClass {

    companion object {

        fun toast(context: Context) {
            Toast.makeText(context, "This is a test Library", Toast.LENGTH_SHORT).show()
        }

    }

}