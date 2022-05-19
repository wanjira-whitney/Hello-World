package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorBmiActivity : AppCompatActivity() {
    lateinit var btnCalculate: Button
    lateinit var etHeight: EditText
    lateinit var etWeight: EditText
    lateinit var tvBmi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_bmi)
        
        btnCalculate = findViewById(R.id.btnCalculate)
        etWeight = findViewById(R.id.imgWeight)
        etHeight = findViewById(R.id.etHeight)
        tvBmi = findViewById(R.id.tvBmi)
        
        btnCalculate.setOnClickListener {
            var weight = etWeight.text.toString().toDouble()
            var height = etHeight.text.toString().toInt()
            calculatorBmi(weight,height)
        }
    }

    fun calculatorBmi(weight: Double, height: Int){
        val heightMetres = height/100
        val bmi = weight/(heightMetres*heightMetres)
        tvBmi.text = bmi.toString()
    }
}