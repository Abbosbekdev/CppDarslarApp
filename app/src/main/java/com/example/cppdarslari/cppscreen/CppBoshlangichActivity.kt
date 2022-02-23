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
import kotlinx.android.synthetic.main.activity_prog_lenguage.*

class CppBoshlangichActivity : AppCompatActivity() {
    val boshlangichList = listOf(
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"C++ tilining asosiy tushunchalari",0),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Ma'lumotning turlari",1),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Ma'lumotning mantiqiy toifasi",2),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Shart operatori",3),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Tanlash operatori",4),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"For sikl operatori",5),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"while operatori",6),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"do-while operatori",7),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Funksiyalar",8),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Massivlar haqida tushuncha",9),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Ko'p o'lchamli massivlar",10),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"String sinfi",11),
        ProgrammingModel(R.drawable.ic_programming_monitor_svgrepo_com,"Rekursiya",12)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpp_boshlangich)
        recyclerBoshlangich.layoutManager = LinearLayoutManager(this)
        recyclerBoshlangich.adapter = ProgrammingAdapter(boshlangichList,object : ProgListener{
            override fun onClick(item: ProgrammingModel) {
                var intent = Intent(this@CppBoshlangichActivity,CppdarsActivity::class.java)
                intent.putExtra("basic",item)
                startActivity(intent)
            }
        })
    }
}