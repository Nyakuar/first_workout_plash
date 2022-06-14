package dev.nyakuar.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignup: TextView
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvSignup = findViewById(R.id.tvSignup)
        etEmail = findViewById(R.id.etEmail)
        tilEmail = findViewById(R.id.tilEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tilPassword = findViewById(R.id.tilPassword)

        tvSignup.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity ::class.java)
            startActivity(intent)

            validateLogin()

        }

    }

    fun validateLogin() {

        var email = etEmail.text.toString()
        var Password = etPassword.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "email is required"
        }
        if (Password.isBlank()) {
            tilPassword.error = "email is required"

        }
    }



}





