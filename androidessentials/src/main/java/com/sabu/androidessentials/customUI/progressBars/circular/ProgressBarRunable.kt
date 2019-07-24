package com.sabu.androidessentials.customUI.progressBars.circular

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.ScaleDrawable
import android.view.Gravity
import android.widget.ProgressBar
import android.R.id.message
import android.os.Message


class ProgressBarRunable(progressBar: ProgressBar, threadName: String) : Runnable {
    var progressBar = progressBar
    var threadName = threadName
    override fun run() {
        var i = 0
        while (i < 360) {
            try {
                val m = Message()
                m.copyFrom(Message())
                progressBar.rotation = i.toFloat()
//            progressBar?.progress = 360-i
                Thread.sleep(3)
                i++
                if (i == 360) {
                    i = 0
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }

    fun start() {
        val thread = Thread(this, threadName)
        thread.start()
    }
}