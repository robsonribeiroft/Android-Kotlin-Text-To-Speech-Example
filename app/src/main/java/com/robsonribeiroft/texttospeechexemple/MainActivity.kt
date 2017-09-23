package com.robsonribeiroft.texttospeechexemple

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.editText) as EditText
        val aSwitch = findViewById(R.id.switch1) as Switch
        val button = findViewById(R.id.button) as Button

        button.setOnClickListener { TTS(this@MainActivity, editText.text.toString(), aSwitch.isChecked) }
    }
}
