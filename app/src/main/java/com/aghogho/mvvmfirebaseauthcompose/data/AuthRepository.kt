package com.aghogho.mvvmfirebaseauthcompose.data

import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    //gets currently logged in user
    val currentUser: FirebaseUser?
    suspend fun signup(name: String, email: String, password: String): Resource<FirebaseUser>
    suspend fun login(email: String, password: String): Resource<FirebaseUser>
    fun logout()
}
