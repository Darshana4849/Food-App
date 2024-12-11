package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, ItemActivity::class.java)
            startActivity(intent)
        }
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, pizzaActivity::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, HotdogsActivity::class.java)
            startActivity(intent)
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, FrenchActivity::class.java)
            startActivity(intent)
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, SandwichesActivity::class.java)
            startActivity(intent)
        }


    }
}
