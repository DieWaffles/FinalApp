package edu.usna.mobileos.finalapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONObject

class CreateCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_code)
        findViewById<Button>(R.id.genQRBut).setOnClickListener{
            val intent = Intent(baseContext, GenQRCode::class.java)
            val nameText : EditText = findViewById(R.id.OwnerName)
            val numText : EditText = findViewById(R.id.NumField)
            val stringName : String = nameText.text.toString()
            val stringNum : String = numText.text.toString()
            val json = JSONArray()
            json.put(stringName)
            json.put(stringName)
            intent.putExtra("JSON Array",json.toString())
            startActivity(intent)
        }
    }
}