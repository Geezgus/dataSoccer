package com.github.geezgus.datasoccer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    data class Extra(val name: String, val value: Any)

    data class Team(val name: String, val shirtColor: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayOf(
            arrayOf(findViewById<Button>(R.id.btn_brazil), Team("Brazil", "#FDE931")),
            arrayOf(findViewById<Button>(R.id.btn_serbia), Team("Serbia", "#DF2C3F")),
            arrayOf(findViewById<Button>(R.id.btn_switzerland), Team("Switzerland", "#FFFFFF")),
            arrayOf(findViewById<Button>(R.id.btn_cameroon), Team("Cameroon", "#054C40"))
        ).forEach {
            val button = it[0] as Button
            val team = it[1] as Team
            button.setOnClickListener {
                openFormationActivity(team)
            }
        }
    }

    private fun openFormationActivity(team: Team) {
        val intent = Intent(this, FormationActivity::class.java)

        intent.putExtra("TEAM_NAME", team.name)
        intent.putExtra("SHIRT_COLOR", team.shirtColor)

        startActivity(intent)
    }
}
