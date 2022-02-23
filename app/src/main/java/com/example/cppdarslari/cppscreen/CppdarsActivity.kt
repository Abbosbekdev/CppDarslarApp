package com.example.cppdarslari.cppscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ProgrammingModel
import kotlinx.android.synthetic.main.activity_cppdars.*

class CppdarsActivity : AppCompatActivity() {
    var cppdarsList : ProgrammingModel ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cppdars)

        cppdarsList = intent.getSerializableExtra("basic") as ProgrammingModel
        tvDarsActionBar.text = cppdarsList!!.titleProg
    }
}