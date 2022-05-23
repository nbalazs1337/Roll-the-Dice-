package com.example.mydice
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.txt_number)
        rollButton.setOnClickListener {

            val myDice = Dice(6)
            textView.text = myDice.roll().toString()
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        }

    }
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}