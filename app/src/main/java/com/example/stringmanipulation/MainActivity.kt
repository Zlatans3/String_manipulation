package com.example.stringmanipulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stringmanipulation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upperCaseButton.setOnClickListener {
            val text = binding.inputEditText.text.trim().toString()
            if (text.isEmpty()) {
                binding.inputEditText.error = "No input"
                return@setOnClickListener
            }
            val result = text.uppercase()
            binding.resultTextView.text = result
        }
    }
}