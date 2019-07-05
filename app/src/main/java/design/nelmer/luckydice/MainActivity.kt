package design.nelmer.luckydice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceResult: TextView = findViewById(R.id.tv_diceResult)
        val randomInt = Random().nextInt(6) + 1

        diceResult.text = randomInt.toString()
    }
}
