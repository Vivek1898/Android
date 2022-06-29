package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.apply {
            isVisible = false
            text = "10"
            setTextColor(getColor(R.color.teal_200))
            textSize = 30f
        }

        editText.apply {
    // isEnabled = false
            hint = "Enter Your Name"
            setText("Vivek Singh")

            addTextChangedListener {
                //geting current written char onChange of textView
                Log.i("ViewBinding", it.toString())
                button.isEnabled = it.toString().length in 7..19

            }
        }
        button.setOnClickListener {
            Toast.makeText(it.context, "Button pressed", Toast.LENGTH_LONG).show()
        }


//        textView.text="10"
//
//        textView.setTextColor(getColor(androidx.appcompat.R.color.error_color_material_dark))

    }

//    fun showtoast(view: View) {
//        Toast.makeText(view.context, "Button pressed from interface function", Toast.LENGTH_LONG).show()
//    }
}