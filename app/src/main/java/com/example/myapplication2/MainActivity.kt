package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nom = findViewById<TextView>(R.id.nom)
        val prenom = findViewById<TextView>(R.id.prenom)
        val desc = findViewById<TextView>(R.id.desc)


        val mybutton : Button = findViewById(R.id.button)
        mybutton.setOnClickListener({ view -> goSecondPage(nom.text.toString(), prenom.text.toString(),desc.text.toString()) })


    }

    fun goSecondPage(nom:String,prenom:String,desc:String) {
        val intent: Intent = Intent(this, ActivitySecond::class.java )
        intent.putExtra("nom",nom)
        intent.putExtra("prenom",prenom)
        intent.putExtra("desc",desc)
        startActivity(intent)

    }
}