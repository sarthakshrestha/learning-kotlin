package com.example.memories

import androidx.lifecycle.ViewModel

class LoginScreenViewModel: ViewModel() {

}

data class LoginScreenIOState(
    val email: String = "",
    val password: String = "",
    val rememberMe: Boolean = false,
    val isPasswordVisible: Boolean = false
)

