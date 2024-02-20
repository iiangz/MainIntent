package com.example.mainintentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithData.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveActivityWithData =
                    Intent(this@MainActivity, MoveActivityWithData::class.java)
                moveActivityWithData.putExtra(
                    MoveActivityWithData.EXTRA_NAME,
                    "Radithya cahya"
                )

                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 9999)
                startActivity(moveActivityWithData)
            }

            R.id.btn_dial_number -> {
                val phoneNumber = "911"
                val dialPhoneIntent = Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber")
                )
                startActivity(dialPhoneIntent)
            }

        }
    }
}