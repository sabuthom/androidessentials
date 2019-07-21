package com.sabu.androidessentials.networkHelpers

import android.content.Context
import android.net.ConnectivityManager
import android.support.v4.content.ContextCompat

class HelperNetwork {

    fun isAppOnline(context: Context):Boolean{
        var connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo != null
    }
}