package com.sabu.androidessentials.customUI.progressBars.circular

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sabu.androidessentials.R
import kotlinx.android.synthetic.main.dialog_circular_progress.*

class CircularProgressDialog : DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_circular_progress, container, false)
        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        isCancelable = false
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var progressBarRunable = ProgressBarRunable(pb_circular,"progressThread1")
        progressBarRunable.start()
    }
}