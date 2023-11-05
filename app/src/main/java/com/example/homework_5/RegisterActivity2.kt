package com.example.homework_5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_5.databinding.ActivityRegister2Binding
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityRegister2Binding

    private fun addingUsername(inputtedUsername: String) {
        val user = Firebase.auth.currentUser
        val updatedUsername =
            UserProfileChangeRequest.Builder().setDisplayName(inputtedUsername).build()

        user?.updateProfile(updatedUsername)?.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val intent = Intent(this, LoggedInActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username couldn't be updated", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.register2BackBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity1::class.java)
            startActivity(intent)
        }
        binding.register2SignUpBtn.setOnClickListener {
            val userNameInput = binding.username.text.toString()
            addingUsername(userNameInput)
        }
    }
}