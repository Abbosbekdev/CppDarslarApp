package com.example.cppdarslari.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cppdarslari.Adapter.ExampleAdapter
import com.example.cppdarslari.Adapter.ExampleListener
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ExampleModel
import kotlinx.android.synthetic.main.activity_example.*

class ExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val examplePhotos = listOf(
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample),
            ExampleModel(R.drawable.shaxmatexample)
        )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        recyclerExamplePhoto.layoutManager = GridLayoutManager(this,2)
        recyclerExamplePhoto.adapter = ExampleAdapter(examplePhotos,object : ExampleListener{
            override fun onClick(item: ExampleModel) {
                var intent = Intent(this@ExampleActivity,ExamplePhoto2::class.java)
                intent.putExtra("photo",item)
                startActivity(intent)
            }
        })

        btnBack.setOnClickListener{
            finish()
        }
    }
}