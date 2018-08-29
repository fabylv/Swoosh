package com.example.faby.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.faby.swoosh.Utilities.EXTRA_LEAGUE
import com.example.faby.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishClicked(view: View){
        val finishActivity = Intent(this, FinishActivity::class.java)
        startActivity(finishActivity)
    }

}
