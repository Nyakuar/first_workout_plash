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
    lateinit var btntxview: TextView

    lateinit var tilFirstname: TextInputLayout
    lateinit var tilLastname: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilConfirmPassword: TextInputLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
//
//        etFirstname  = findViewById(R.id.etFirstname )
//        etLastname   = findViewById(R.id.etLastname  )
//        etEmail   = findViewById(R.id.etEmail  )
//        etPassword   = findViewById(R.id.etPassword  )
//        etConfirmPassword   = findViewById(R.id.etConfirmPassword )
//        btnSignup  = findViewById(R.id.tvSignup)
//        btntxview = findViewById(R.id.btnLogin)
//        tilEmail   = findViewById(R.id.tilEmail )
//        tilFirstname   = findViewById(R.id.tilFirstname  )
//        tilFirstname   = findViewById(R.id.tilLastname )
//        tilPassword  = findViewById(R.id.tilPasswpord )
//        tilConfirmPassword   = findViewById(R.id.tilConfirmpassword )

//        btnSignup .setOnClickListener{
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)



//        tvSignup  .setOnClickListener{
//                val intent = Intent(this, LoginActivity::class.java)
//                startActivity(intent)
//
//                validateSign()
        }


//        fun   validateSign(){
//
//            var firstname=etFirstname.text.toString()
//            var Lastname=etFirstname.text.toString()
//            var Email =etFirstname.text.toString()
//            var Password=etFirstname.text.toString()
//            var ConfirmPassword=etFirstname.text.toString()
//            if (firstname.isBlank() ){
//                tilPassword.error="Enter last name"
//            }
//            if (Lastname.isBlank() ){
//                tilFirstname .error="Enter last name"
//           }
//
//            if (Email .isBlank() ){
//                tilEmail .error="Enter last name"
//           }
//            if (Password .isBlank() ){
//                tilPassword.error="Enter last name"
//           }
//            if (ConfirmPassword  .isBlank() ){
//                tilConfirmPassword.error="Enter last name"
//
//
//            }
//
//        }

       }

