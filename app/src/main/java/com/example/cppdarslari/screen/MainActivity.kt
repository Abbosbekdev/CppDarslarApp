package com.example.cppdarslari.screen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cppdarslari.Adapter.ExampleAdapter
import com.example.cppdarslari.Adapter.ExampleListener
import com.example.cppdarslari.Adapter.MenuCppOnclickListener
import com.example.cppdarslari.Adapter.MenucppAdapter
import com.example.cppdarslari.R
import com.example.cppdarslari.cppscreen.CppBoshlangichActivity
import com.example.cppdarslari.cppscreen.CppOOPActivity
import com.example.cppdarslari.itkompaniyalr.ItCompanyActivity
import com.example.cppdarslari.model.ExampleModel
import com.example.cppdarslari.model.MenuModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val examples = listOf(
        ExampleModel(R.drawable.shaxmatexample),
        ExampleModel(R.drawable.example2),
        ExampleModel(R.drawable.example3),
        ExampleModel(R.drawable.example4),
        ExampleModel(R.drawable.example5),
        ExampleModel(R.drawable.example6),
        ExampleModel(R.drawable.example7),
        ExampleModel(R.drawable.example8),
        ExampleModel(R.drawable.example9),
        ExampleModel(R.drawable.example10)
    )
    val cppmenu = listOf(
        MenuModel(0, R.drawable.menu_cpp,"C++ \nasoslari"),
        MenuModel(1, R.drawable.menu_cpp,"C++ \nOOP"),
        MenuModel(2, R.drawable.ic_reading_svgrepo_com,"Testlar"),
        MenuModel(3, R.drawable.ic_programmer_svgrepo_com,"C++ kod\n tahlili"),
        MenuModel(4, R.drawable.ic_student_svgrepo_com,"Video \nDarslar"),
        MenuModel(5, R.drawable.ic_github_svgrepo_com,"Github link"),
        MenuModel(6, R.drawable.company,"IT Kompaniyalar"),
        MenuModel(7, R.drawable.ic_coding,"Dasturlash tillari"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMenu.layoutManager = GridLayoutManager(this,2)
        recyclerMenu.adapter = MenucppAdapter(cppmenu,object : MenuCppOnclickListener{
            override fun onClick(item: MenuModel) {
                if (item.id==0){
                    startActivity(Intent(this@MainActivity,CppBoshlangichActivity::class.java))
                }else if (item.id==1){
                    startActivity(Intent(this@MainActivity,CppOOPActivity::class.java))
                }else if (item.id==2){
                    Toast.makeText(this@MainActivity,"Testlar tez orada yuklanadi",Toast.LENGTH_SHORT).show()
                }else if (item.id==3){
                    Toast.makeText(this@MainActivity,"Kod tahlili tez orada yuklanadi",Toast.LENGTH_SHORT).show()
                }
                else if(item.id==4){
                    Toast.makeText(this@MainActivity,"Video darslar tez orada yuklanadi",Toast.LENGTH_SHORT).show()
                }else if (item.id==5){
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Abbosbekdev"))
                    startActivity(intent)
                }
                else if(item.id==6){
                    startActivity(Intent(this@MainActivity,ItCompanyActivity::class.java))
                }else if (item.id==7){
                    startActivity(Intent(this@MainActivity, ProgLenguageActivity::class.java))
                }
            }
        })
        recyclerExample.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerExample.adapter = ExampleAdapter(examples,object : ExampleListener{
            override fun onClick(item: ExampleModel) {
                var intent =Intent(this@MainActivity,ExamplePhotosActivity::class.java)
                intent.putExtra("extra",item)
                startActivity(intent)
            }
        })
        lnWeb.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)
        }
        cardExample.setOnClickListener {
            startActivity(Intent(this,ExampleActivity::class.java))
        }
    }
}