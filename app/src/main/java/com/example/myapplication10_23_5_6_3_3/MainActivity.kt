package com.example.myapplication10_23_5_6_3_3

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class MainActivity : AppCompatActivity() {

    private val imageUrl = "https://img.freepik.com/free-vector/open-blue-book-white_1308-69339.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)

        Glide.with(applicationContext)
            .load(imageUrl)
            .centerInside()
            .transform(RoundedCorners(10))
            .placeholder(R.drawable.barsik)
            .into(image)
    }
}