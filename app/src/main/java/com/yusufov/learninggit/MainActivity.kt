package com.yusufov.learninggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.yusufov.learninggit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        println("Cefer")
        println("Qurban")

        binding.btnCount.setOnClickListener {
            binding.txtNumber.setText(number.toString())
            number+=1

        }
    }


    //Comment2
}