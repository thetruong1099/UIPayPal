package com.example.uipaypal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_card.*

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        btnMore.setOnClickListener {
            btnMore.visibility = View.GONE
            btnDelete.visibility = View.VISIBLE
            btnExit.visibility = View.VISIBLE
            btnEdit.visibility = View.VISIBLE
        }

        btnExit.setOnClickListener {
            btnMore.visibility = View.VISIBLE
            btnDelete.visibility = View.GONE
            btnExit.visibility = View.GONE
            btnEdit.visibility = View.GONE
        }
    }
}