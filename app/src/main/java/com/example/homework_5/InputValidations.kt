package com.example.homework_5

import android.util.Patterns


class InputValidations {
    fun filledInputs(inputArray: Array<String>): Boolean {
        for (input in inputArray) {
            if (input.isEmpty()) run {
                return false
            }
        }
        return true
    }

    fun emailValidation(inputtedEmail: String): Boolean {
        val emailMatcher = Patterns.EMAIL_ADDRESS.matcher(inputtedEmail)
        if (emailMatcher.matches()) {
            emailMatcher.toString()
            return true
        }
        return false
    }

    fun usernameValidation(inputtedUsername: String): Boolean {
        return inputtedUsername.length > 10 && !inputtedUsername.contains(" ")
    }

    fun passwordValidation(inputtedPassword: String): Boolean {
        return inputtedPassword.length >= 8 && !inputtedPassword.contains(" ")
    }
}