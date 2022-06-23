package dev.nyakuar.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.nyakuar.workoutlog.databinding.ActivityLoginBinding
import dev.nyakuar.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
   lateinit var binding: ActivitySignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_sign_up)

//        etFirstname = findViewById(R.id.etFirstname)
//        etLastname = findViewById(R.id.etLastname)
//        etEmail = findViewById(R.id.etEmail)
//        etPassword = findViewById(R.id.etPassword)
//        etConfirmPassword = findViewById(R.id.etConfirmPassword)
//        btnSignup = findViewById(R.id.btnSignup)
//        tvlogin = findViewById(R.id.tvlogin)
//        tilEmail = findViewById(R.id.tilEmail)
//        tilFirstname = findViewById(R.id.tilFirstname)
//        tilLastname = findViewById(R.id.tilLastname)
//        tilPassword = findViewById(R.id.tilPasswpord)
//        tilConfirmPassword = findViewById(R.id.tilConfirmpassword)




        binding.tvlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
        binding.btnSignup .setOnClickListener {
            validateLogin()

        }

    }

    fun validateLogin() {
            var firstname=binding.etFirstname.text.toString()
            var lastname=binding.etLastname.text.toString()
            var email =binding.etEmail .text.toString()
            var password=binding.etPassword .text.toString()
            var confirmPassword=binding.etConfirmPassword .text.toString()



        if (firstname.isBlank() ){
                binding.etFirstname .error="Enter first name"
            }
            if (lastname.isBlank() ){
                binding.etLastname .error="Enter last name"
           }

            if (email .isBlank() ){
                binding.etEmail.error="Enter email"
           }
            if (password .isBlank() ){
                binding.etPassword.error="Enter password"
           }
            if (confirmPassword  .isBlank() ){
                binding.etConfirmPassword.error="Confirm password"



    }
    }

 }
