package com.example.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.selectedImageView)
        val imageResId = intent.getIntExtra("imageResId",0)
        if (imageResId!=0 ){
            imageView.setImageResource(imageResId)
        }
    }
}