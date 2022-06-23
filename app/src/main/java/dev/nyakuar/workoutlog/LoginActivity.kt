package dev.nyakuar.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.nyakuar.workoutlog.databinding.ActivityHomeBinding
import dev.nyakuar.workoutlog.databinding.ActivityLoginBinding
import dev.nyakuar.workoutlog.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvSignup.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity ::class.java)
            startActivity(intent)

            validateLogin()

        }

    }

    fun validateLogin() {

        var email = binding.etEmail.text.toString()
        var Password = binding.etPassword.text.toString()
        if (email.isBlank()) {
            binding.tilEmail.error = "email is required"
        }
        if (Password.isBlank()) {
            binding.tilPassword.error = "email is required"

        }


    }


}





