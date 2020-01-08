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
            val snackbar = Snackbar.make(history,"The content is useful",Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close",View.OnClickListener {
                snackbar.dismiss()
            })

            snackbar.show()
        }

        dislike1.setOnClickListener(){
            val snackbar = Snackbar.make(history,"The content is not useful",Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Close",View.OnClickListener {
                snackbar.dismiss()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            val view = snackbar.view
            val text = view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            text.setTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
            snackbar.show()
        }
    }
}
