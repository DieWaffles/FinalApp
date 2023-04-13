package edu.usna.mobileos.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.addDog).setOnClickListener{
            val intent = Intent(baseContext, CreateCode::class.java)
            startActivity(intent)
        }
    }
}