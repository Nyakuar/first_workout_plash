package dev.nyakuar.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.nyakuar.workoutlog.databinding.ActivityHomeBinding
import dev.nyakuar.workoutlog.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    lateinit var bnvHome :BottomNavigationView
    lateinit var fcvHome :FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        castView()
        setupBottomNav()

    }
    fun castView (){
        bnvHome = findViewById(R.id.bottomNavigationView )
        fcvHome = findViewById(R.id.fcvHome)
}
    fun setupBottomNav(){
       bnvHome.setOnItemSelectedListener{ item->
           when (item .itemId ){
               R.id.plan ->{
                   supportFragmentManager.beginTransaction().replace(R.id .fcvHome, PlanFragment()).commit()
                   true

               }
               R.id.track ->{
                   supportFragmentManager.beginTransaction().replace(R.id .fcvHome, TrackFragment()).commit()
                   true

           }
               R.id.profile  ->{
                   supportFragmentManager.beginTransaction().replace(R.id .fcvHome, ProfileFragment ()).commit()
                   true

               }
               else-> false



    }
}

    }
}