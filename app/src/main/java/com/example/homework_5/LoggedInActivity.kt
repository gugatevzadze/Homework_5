package com.example.homework_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_5.databinding.ActivityLoggedInBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoggedInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoggedInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoggedInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = Firebase.auth.currentUser

        binding.displayUserName.text = user?.displayName
        binding.displayMail.text = user?.email

    }
}