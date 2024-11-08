package com.example.adaptertp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
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
        val languages = listOf(
            Languages("python",R.drawable.download),
            Languages("C",R.drawable.c),
            Languages("java",R.drawable.java),
            Languages("kotlin",R.drawable.kotlin)
            )
        val liste = findViewById<ListView>(R.id.list)
        var adapter = LanguageAdapter(this,languages)
        liste.adapter = adapter
    }
}