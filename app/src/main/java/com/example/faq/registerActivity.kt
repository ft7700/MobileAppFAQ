package com.example.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_download.*
import kotlinx.android.synthetic.main.activity_register.*

class registerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        like5.setOnClickListener(){
            var a = likeNum5.text.toString().toInt()
            a++.toString()
            likeNum5.setText(a.toString())

            val snackbar = Snackbar.make(register,"The content is useful",Snackbar.LENGTH_SHORT)
            snackbar.setAction("Close",View.OnClickListener {
            })

            snackbar.show()
        }

        dislike5.setOnClickListener(){
            var b = dislikeNum5.text.toString().toInt()
            b--.toString()
            dislikeNum5.setText(b.toString())
            val snackbar = Snackbar.make(register,"The content is not useful",Snackbar.LENGTH_SHORT)
            snackbar.setAction("Close",View.OnClickListener {
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            snackbar.show()
        }
    }
}
