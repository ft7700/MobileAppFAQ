package com.example.faq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_charges.*
import kotlinx.android.synthetic.main.activity_history.*

class chargesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charges)

        like2.setOnClickListener(){
            var a = likeNum2.text.toString().toInt()
            a++.toString()
            likeNum2.setText(a.toString())

            val snackbar = Snackbar.make(charges,"The content is useful",Snackbar.LENGTH_SHORT)
            snackbar.setAction("Close",View.OnClickListener {
            })

            snackbar.show()
        }

        dislike2.setOnClickListener(){
            var d = dislikeNum2.text.toString().toInt()
            d--.toString()
            dislikeNum2.setText(d.toString())
            val snackbar = Snackbar.make(charges,"The content is not useful",Snackbar.LENGTH_SHORT)
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
