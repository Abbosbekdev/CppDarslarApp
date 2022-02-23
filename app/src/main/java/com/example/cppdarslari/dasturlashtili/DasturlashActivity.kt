package com.example.cppdarslari.dasturlashtili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ProgrammingModel
import kotlinx.android.synthetic.main.activity_dasturlash.*

class DasturlashActivity : AppCompatActivity() {
    var dasturlashList : ProgrammingModel?=null
    val itMalumot = arrayOf(
        R.string.java,
        R.string.python,
        R.string.cpp,
        R.string.swift,
        R.string.kotlin,
        R.string.go,
        R.string.javascript
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasturlash)

        dasturlashList = intent.getSerializableExtra("language") as ProgrammingModel
        imgDastur.setImageResource(dasturlashList!!.imgProg)
        tvDasturlash.text = getString(itMalumot[dasturlashList!!.id])
    }
}