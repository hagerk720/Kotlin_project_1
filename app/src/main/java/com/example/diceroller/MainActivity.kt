package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImg : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImg= findViewById(R.id.dice_img)
        val rollButton :Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val randNum  = Random().nextInt(6)+1
        var drawableRes = when(randNum){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        diceImg.setImageResource(drawableRes)
    }
}