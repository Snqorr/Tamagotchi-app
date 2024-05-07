package com.myappname.appx

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private lateinit var petImageView: ImageView
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var happyTextView: TextView
    private lateinit var hungerTextView: TextView
    private lateinit var cleanlinessTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        petImageView = findViewById(R.id.petImageView)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton)
        playButton = findViewById(R.id.playButton)
        happyTextView = findViewById(R.id.happyTextView)
        hungerTextView = findViewById(R.id.hungerTextView)
        cleanlinessTextView = findViewById(R.id.cleanlinessTextView)

        feedButton.setOnClickListener {
            //Update pet image for feeding action
            petImageView.setImageResource(R.drawable.dog_food)

            //Update status values (e.g., happy, hunger, cleanliness)
            //based on the feeding action
            //Example: healthTextView.text = "Health: " + updatedHealthValue
        }

        cleanButton.setOnClickListener {
            //Update pet image for cleaning action
            petImageView.setImageResource(R.drawable.dog_being_washed)

            //Update status values (e.g., happy, hunger, cleanliness)
            //based on the cleaning action
            //Example: cleanlinessTextView.text = "Cleanliness: " + updatedCleanlinessValue
        }

        playButton.setOnClickListener {
            //Update pet image for playing action
            petImageView.setImageResource(R.drawable.dogg_playing)

            //Update status value (e.g., happy, hunger, cleanliness)
            //based on the playing action
            //Example: happyTextView.text = "Happiness: " + updatedHappinessValue
        }


    }
}