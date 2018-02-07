package com.akshay.sensorlivedata

import android.app.Application
import android.arch.lifecycle.AndroidViewModel

class SensorViewModel(application: Application) : AndroidViewModel(application) {
    private val sensorLiveData = SensorLiveData(application)

    fun getSensorData() = sensorLiveData
}