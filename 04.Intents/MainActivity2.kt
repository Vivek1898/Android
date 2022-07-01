package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
  //Reciving data
        val name = intent.getStringExtra(KEY1)
        val age=intent.getIntExtra(KEY2,0)
        val isStudent=intent.getBooleanExtra(KEY3,false)
        textView.text="Name => $name Age => $age Student => $isStudent"

    }
}