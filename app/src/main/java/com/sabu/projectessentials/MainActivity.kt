package com.sabu.projectessentials

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.sabu.androidessentials.customUI.progressBars.circular.CircularProgressDialog
import com.sabu.androidessentials.networkHelpers.HelperNetwork

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (HelperNetwork().isAppOnline(this)) {
            Toast.makeText(this, "online", Toast.LENGTH_SHORT).show()
        }

        var circularProgressDialog = CircularProgressDialog()
        circularProgressDialog.show(supportFragmentManager,"")
    }
}
