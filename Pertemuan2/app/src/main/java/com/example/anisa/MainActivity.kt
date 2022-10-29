package com.example.anisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anisa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.ButPositifa.setOnClickListener {
            scoreA = scoreA +1
            binding.tvScoreA.text = scoreA.toString()
        }
        binding.ButNegatifb.setOnClickListener {
            scoreA = scoreA - 1
            binding.tvScoreA.text = scoreA.toString()
        }
        binding.ButTeam2AA.setOnClickListener {
            if(scoreB > 0){
            scoreB = scoreB + 1
            binding.tvScoreAb.text = scoreB.toString()
        }
        }
        binding.ButTeam2b.setOnClickListener {
            scoreB = scoreB - 1
            binding.tvScoreAb.text = scoreB.toString()
        }
        binding.button.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.tvTeamA.text = scoreA.toString()
            binding.tvScoreAb.text = scoreA.toString()

        }
    }
}