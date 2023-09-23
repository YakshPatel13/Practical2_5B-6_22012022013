package com.example.practical2_5b_6_22012022013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val test = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Display("OnCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Display("OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Display("OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Display("OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Display("OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Display("OnDistroy Called")
    }
    fun Display(msg:String){
        Toast.makeText(this,"$msg", Toast.LENGTH_LONG).show()
        Log.i(test,"$msg")
        Snackbar.make(findViewById(R.id.l1),"$msg", Snackbar.LENGTH_LONG).show()
    }

}