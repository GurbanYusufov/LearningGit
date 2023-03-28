package com.yusufov.learninggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private var number:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Cefer")
        println("Qurban")
    }

    fun btn_add(view:View){
        findViewById<AppCompatButton>(R.id.txt_number).setText(number)
        number+=1
    }
    //Comment2
}