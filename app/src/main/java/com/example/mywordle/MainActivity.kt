package com.example.mywordle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: InputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.edt11.addTextChangedListner(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
            }

        } )



    }
}