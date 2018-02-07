package com.akshay.sensorlivedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get SensorViewModel
        val sensorViewModel = ViewModelProviders.of(this).get(SensorViewModel::class.java)
        // Observe the sensor vale
        sensorViewModel.getSensorData().observe(this, Observer {
            value.text = it.toString()
        })
    }
}
