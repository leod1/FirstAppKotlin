package com.example.myapplication2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivitySecond: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nom:String = intent.getStringExtra("nom") ?: "defaultnom"
        val premon:String = intent.getStringExtra("prenom") ?: "defaultpremon"
        val desc:String = intent.getStringExtra("desc") ?: "defaultdesc"

        val tv: TextView = findViewById(R.id.title2)
        tv.text = "CV de $premon"

        val tv2: TextView = findViewById(R.id.presentation)
        tv2.text = "Je me présente, je m'appelle $premon $nom et ceci est mon CV"

        val tv3: TextView = findViewById(R.id.descuser)
        tv3.text = desc



    }


}