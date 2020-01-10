package com.example.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_history.*

class historyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        like1.setOnClickListener(){
            var a = likeNum1.text.toString().toInt()
            a++.toString()
            likeNum1.setText(a.toString())

            val snackbar = Snackbar.make(history,"The content is useful",Snackbar.LENGTH_SHORT)
            snackbar.setAction("Close",View.OnClickListener {
            })

            snackbar.show()
        }

        dislike1.setOnClickListener(){
            var b = dislikeNum1.text.toString().toInt()
            b--.toString()
            dislikeNum1.setText(b.toString())
            val snackbar = Snackbar.make(history,"The content is not useful",Snackbar.LENGTH_SHORT)
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
