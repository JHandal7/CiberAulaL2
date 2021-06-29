package com.ahira.ciberaulal2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.numero1)
        val num2: EditText = findViewById(R.id.number2)
        val result: TextView = findViewById(R.id.resultado)

        val boton: Button = findViewById(R.id.button)
        boton.setOnClickListener {

            result.text = "La suma es: " + (num1.text.toString().toInt() + num2.text.toString().toInt()).toString()
// Ooculta el teclado:
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)

        }

    }
}