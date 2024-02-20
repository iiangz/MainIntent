package com.example.mainintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveActivityWithData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvDataRecived: TextView =
            findViewById(R.id.tv_data_received)

        val name = intent.getStringArrayExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE,0)

        val text = "name : $name, Your Age : $age"
        tvDataRecived.text = text
    }

    companion object {
        const val EXTRA_AGE = "extra age"
        const val EXTRA_NAME = "extra name"
    }
}