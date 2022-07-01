package com.example.first

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener

const val KEY1="Name"
const val KEY2="Age"
const val KEY3="isStudying"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      button.setOnClickListener {
        val i= Intent(this,MainActivity2 ::class.java)
          i.putExtra(KEY1,"Vivek")
          i.putExtra(KEY2,23)
          i.putExtra(KEY3,false)


          startActivity(i)
    }

        mailbtn.setOnClickListener {
            val email =editTextTextPersonName.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto:$email")
            startActivity(i)
        }
        browsebtn.setOnClickListener {
            val address =editTextTextPersonName.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$address.com")
            startActivity(i)
        }
        dailbtn.setOnClickListener {
            val mobile =editTextTextPersonName.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$mobile")
            startActivity(i)
        }

//        textView.text="10"
//
//        textView.setTextColor(getColor(androidx.appcompat.R.color.error_color_material_dark))

    }

}