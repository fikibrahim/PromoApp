package com.apppromo.promoapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PromoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
       Log.d(TAG,"Comming_inside_onCreate")
    }

    companion object{
        const val TAG = "PromoApplication"
    }
}