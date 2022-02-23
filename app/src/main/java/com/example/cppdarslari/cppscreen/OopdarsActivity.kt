package com.example.cppdarslari.cppscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ProgrammingModel
import kotlinx.android.synthetic.main.activity_oopdars.*

class OopdarsActivity : AppCompatActivity() {
    lateinit var oopdarsList : ProgrammingModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oopdars)

        oopdarsList = intent.getSerializableExtra("oop") as ProgrammingModel
        tvDarsActionBar.text = oopdarsList.titleProg
    }
}