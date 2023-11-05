package com.example.homework_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //placed intent in separate function to reduce redundant code
    private fun buttonClick(destinationClass: Class<*>){
        val intent = Intent(this, destinationClass)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            buttonClick(LoginActivity::class.java)
        }
        binding.registerBtn.setOnClickListener {
            buttonClick(RegisterActivity1::class.java)
        }
    }
}