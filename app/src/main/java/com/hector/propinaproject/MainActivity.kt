package com.hector.propinaproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Propina: RadioGroup = findViewById(R.id.radioGroup)
        val RoundUp: Switch = findViewById(R.id.switchRound)
        val Calcular: Button = findViewById(R.id.button)
        val Result: TextView = findViewById(R.id.textTipAmount)
    }
}

//Cost = findviewById(R.id.baba)
//cost.text.toString()