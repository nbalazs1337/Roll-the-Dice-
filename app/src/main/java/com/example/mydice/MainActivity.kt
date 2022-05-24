package com.example.mydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_1)
        val myDice = Dice(6)
        rollButton.setOnClickListener {
            when(myDice.roll())
            {
                1 -> diceImage.setImageResource((R.drawable.dice_1))
                2 -> diceImage.setImageResource((R.drawable.dice_2))
                3 -> diceImage.setImageResource((R.drawable.dice_3))
                4 -> diceImage.setImageResource((R.drawable.dice_4))
                5 -> diceImage.setImageResource((R.drawable.dice_5))
                6 -> diceImage.setImageResource((R.drawable.dice_6))
            }
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        }

    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}