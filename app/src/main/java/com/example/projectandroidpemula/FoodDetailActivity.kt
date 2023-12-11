package com.example.projectandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodDetailActivity : AppCompatActivity() {
    companion object{
        const val extraTitle = "extraTitle"
        const val extraDescription = "extraDescription"
        const val extraPhoto = "extraPhoto"
        const val extraBahan = "extraBahan"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
        supportActionBar?.title = "Detail Makanan"

        val name : TextView = findViewById(R.id.judul)
        val dataDeskripsi : TextView = findViewById(R.id.deskripsi)
        val photo : ImageView = findViewById(R.id.img_item_photo)
        val bahan : TextView = findViewById(R.id.bahan)

        val tvName= intent.getStringExtra(extraTitle)
        val tvDeskription = intent.getStringExtra(extraDescription)
        val tvPhoto = intent.getIntExtra(extraPhoto, 0)
        val tvBahan = intent.getStringExtra(extraBahan)
        name.text = tvName
        dataDeskripsi.text = tvDeskription
        photo.setImageResource(tvPhoto)
        bahan.text = tvBahan

    }
}