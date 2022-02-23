package com.example.cppdarslari.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ExampleModel
import kotlinx.android.synthetic.main.activity_example_photo2.*
import kotlinx.android.synthetic.main.activity_example_photos.*

class ExamplePhoto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val exampleList2 : ExampleModel
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_photo2)


        exampleList2 = intent.getSerializableExtra("photo") as ExampleModel
        imgExample2.setImageResource(exampleList2.imgExample)
    }
}