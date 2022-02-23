package com.example.cppdarslari.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ExampleModel
import kotlinx.android.synthetic.main.activity_example_photos.*

class ExamplePhotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val exampleList : ExampleModel
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_photos)

        exampleList = intent.getSerializableExtra("extra") as ExampleModel
        imgExamplePhoto.setImageResource(exampleList.imgExample)
    }
}