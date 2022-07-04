package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "DICEROLL"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollDice()
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice() {

        val dice = Dice(6)
        val diceroll = dice.roll()
        val resultTextView: ImageView = findViewById(R.id.imageView)
        when (diceroll) {
            1 -> resultTextView.setImageResource(R.drawable.dice_1)
            2 -> resultTextView.setImageResource(R.drawable.dice_2)
            3 -> resultTextView.setImageResource(R.drawable.dice_3)
            4 -> resultTextView.setImageResource(R.drawable.dice_4)
            5 -> resultTextView.setImageResource(R.drawable.dice_5)
            6 -> resultTextView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}