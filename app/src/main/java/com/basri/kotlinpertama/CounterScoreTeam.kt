package com.basri.kotlinpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_counter_score_team.*

class CounterScoreTeam : AppCompatActivity() {

    var resulScoreTeamA = 0
    var resulScoreTeamB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter_score_team)


        //logic counter
        btn_team_a.setOnClickListener {

            resulScoreTeamA = resulScoreTeamA +1
            tv_score_team_a.text = resulScoreTeamA.toString()

        }

        btn_team_b.setOnClickListener {

            resulScoreTeamB = resulScoreTeamB+1
            tv_score_team_b.text = resulScoreTeamB.toString()

        }

        btn_reset.setOnClickListener {
            tv_score_team_a.text = "0"
            tv_score_team_b.text = "0"
        }

    }
}