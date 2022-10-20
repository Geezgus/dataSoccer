package com.github.geezgus.datasoccer

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formation)

        val extras: Bundle? = intent.extras
        if (extras != null) {
            findViewById<ImageView>(R.id.img_bg_field).setBackgroundColor(
                Color.parseColor(
                    extras.getString(
                        "SHIRT_COLOR"
                    )
                )
            )
            Toast.makeText(this, extras.getString("TEAM_NAME"), Toast.LENGTH_SHORT).show()
        }
    }
}