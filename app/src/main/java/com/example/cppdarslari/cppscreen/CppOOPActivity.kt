package com.example.cppdarslari.cppscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cppdarslari.Adapter.ProgListener
import com.example.cppdarslari.Adapter.ProgrammingAdapter
import com.example.cppdarslari.R
import com.example.cppdarslari.model.ProgrammingModel
import kotlinx.android.synthetic.main.activity_cpp_boshlangich.*
import kotlinx.android.synthetic.main.activity_cpp_oopactivity.*

class CppOOPActivity : AppCompatActivity() {
    val oopList = listOf(
        ProgrammingModel(R.drawable.ic_java_svgrepo_com,"Java",0),
        ProgrammingModel(R.drawable.ic_python_svgrepo_com,"Python",1),
        ProgrammingModel(R.drawable.ic_cplusplus_svgrepo_com,"C++",2),
        ProgrammingModel(R.drawable.ic_swift_svgrepo_com,"Swift",3),
        ProgrammingModel(R.drawable.ic_kotlin_svgrepo_com,"Kotlin",4),
        ProgrammingModel(R.drawable.ic_go_gopher_svgrepo_com,"Go",5),
        ProgrammingModel(R.drawable.ic_javascript_svgrepo_com,"JavaScript",6),
        ProgrammingModel(R.drawable.ic_dart_svgrepo_com,"Dart",7),
        ProgrammingModel(R.drawable.ic_ruby_svgrepo_com,"Ruby",8)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpp_oopactivity)
        recyclerOOP.layoutManager = LinearLayoutManager(this)
        recyclerOOP.adapter = ProgrammingAdapter(oopList,object : ProgListener{
            override fun onClick(item: ProgrammingModel) {
                var intent = Intent(this@CppOOPActivity,OopdarsActivity::class.java)
                intent.putExtra("oop",item)
                startActivity(intent)
            }
        })
    }
}