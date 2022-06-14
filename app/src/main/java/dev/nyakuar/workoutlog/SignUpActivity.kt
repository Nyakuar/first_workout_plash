package dev.nyakuar.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var etFirstname: TextInputEditText
    lateinit var etLastname: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var etConfirmPassword: TextInputEditText
    lateinit var btnSignup: Button
    lateinit var tvlogin: TextView
    lateinit var tilFirstname: TextInputLayout
    lateinit var tilLastname: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilConfirmPassword: TextInputLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etFirstname = findViewById(R.id.etFirstname)
        etLastname = findViewById(R.id.etLastname)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnSignup = findViewById(R.id.btnSignup)
        tvlogin = findViewById(R.id.tvlogin)
        tilEmail = findViewById(R.id.tilEmail)
        tilFirstname = findViewById(R.id.tilFirstname)
        tilLastname = findViewById(R.id.tilLastname)
        tilPassword = findViewById(R.id.tilPasswpord)
        tilConfirmPassword = findViewById(R.id.tilConfirmpassword)




        tvlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
        btnSignup .setOnClickListener {
            validateLogin()

        }

    }

    fun validateLogin() {
            var firstname=etFirstname.text.toString()
            var lastname=etLastname.text.toString()
            var email =etEmail .text.toString()
            var password=etPassword .text.toString()
            var confirmPassword=etConfirmPassword .text.toString()



        if (firstname.isBlank() ){
                etFirstname .error="Enter first name"
            }
            if (lastname.isBlank() ){
                etLastname .error="Enter last name"
           }

            if (email .isBlank() ){
                etEmail.error="Enter email"
           }
            if (password .isBlank() ){
                etPassword.error="Enter password"
           }
            if (confirmPassword  .isBlank() ){
                etConfirmPassword.error="Confirm password"


            }
            if (password==confirmPassword ){
                tilConfirmPassword.error ="your password is invalid"

    }
    }

 }
