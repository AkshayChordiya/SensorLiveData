package com.akshay.sensorlivedata

import androidx.lifecycle.Observer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get SensorViewModel
        val sensorViewModel = ViewModelProvider(this).get(SensorViewModel::class.java)
        // Observe the sensor vale
        sensorViewModel.getSensorData().observe(this, Observer {
            value.text = it.toString()
        })
    }
}
