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
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this,"Radio button $isChecked",Toast.LENGTH_SHORT).show()
        }

radioGroup.setOnCheckedChangeListener { group, checkedId ->
    when(checkedId){
        R.id.radioButton ->{
        Toast.makeText(this,"Radio button 1 IS Clicked $checkedId",Toast.LENGTH_SHORT).show()
    }
        R.id.radioButton2 ->{
            Toast.makeText(this,"Radio button 2 is Clicked $checkedId",Toast.LENGTH_SHORT).show()
        }
    }
}


//        textView.text="10"
//
//        textView.setTextColor(getColor(androidx.appcompat.R.color.error_color_material_dark))

    }

}