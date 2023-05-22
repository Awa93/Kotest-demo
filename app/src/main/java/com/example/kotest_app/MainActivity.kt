package com.example.kotest_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1 = findViewById<EditText>(R.id.num1)
        val etNum2 = findViewById<EditText>(R.id.num2)
        val txtTotal = findViewById<TextView>(R.id.txtTotal)
        val btnCalc = findViewById<Button>(R.id.btn1)

        btnCalc.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            try {


                if (num1.isNotEmpty() && num2.isNotEmpty()) {
                    val totalAmount =
                        Calculations().additionOfTwoNumbers(num1.toInt(), num2.toInt())
                    txtTotal.text = "Total = $$totalAmount"
                    txtTotal.setTextColor(getColor(R.color.teal_700))
                    txtTotal.visibility = View.VISIBLE

                } else {
                    txtTotal.text = "please enter valid numbers!"
                    txtTotal.setTextColor(getColor(R.color.purple_200))
                    txtTotal.visibility = View.VISIBLE
                }
            } catch (e: Exception) {
                e.printStackTrace()
                txtTotal.text = "please enter valid numbers!"
                txtTotal.setTextColor(getColor(R.color.purple_200))
                txtTotal.visibility = View.VISIBLE
            }
        }
    }
}