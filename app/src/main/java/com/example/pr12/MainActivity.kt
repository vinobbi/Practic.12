package com.example.pr12

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image = findViewById<ImageView>(R.id.imageView)
        val image2 = findViewById<ImageView>(R.id.imageView2)
        val image3 = findViewById<ImageView>(R.id.imageView3)
        val image4 = findViewById<ImageView>(R.id.imageView4)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGr)
        val cB0 = findViewById<CheckBox>(R.id.checkBox)
        val cB1 = findViewById<CheckBox>(R.id.checkBox1)
        val cB2 = findViewById<CheckBox>(R.id.checkBox2)
        radioGroup.setOnCheckedChangeListener { _, checked ->

            when (checked) {
                R.id.radioButton1 -> image.setImageResource(R.drawable.brff)
                R.id.radioButton2 -> image.setImageResource(R.drawable.cow)
                R.id.radioButton3 -> image.setImageResource(R.drawable.joper)
            }
        }
        cB0.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                image2.setImageResource(R.drawable.brff)
            }
            else {
                image2.setImageDrawable(null)
            }
        }
        cB1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                image3.setImageResource(R.drawable.cow)
            }
            else {
                image3.setImageDrawable(null)
            }
        }
        cB2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                image4.setImageResource(R.drawable.joper)
            }
            else {
                image4.setImageDrawable(null)
            }
        }
    }
}