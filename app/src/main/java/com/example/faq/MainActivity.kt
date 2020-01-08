package com.example.faq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("History / Background","How long has this app been created? And what is the purpose of this app being created?", R.drawable.history))
        list.add(Model("Charges","Do this app cost any charges?", R.drawable.dollar))
        list.add(Model("Info","What are the information that can be found by using this app?", R.drawable.info))
        list.add(Model("Download","Where to download this application? And is there any download charges?", R.drawable.download))
        list.add(Model("Register / Login","Do the first time user need to register in order to use this application?", R.drawable.register))

        listview.adapter = MyAdapter(this,R.layout.row,list)

        listview.setOnItemClickListener{parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if(position == 0){
                Toast.makeText(this@MainActivity,"You click on History / Background",Toast.LENGTH_LONG).show()
                val intent = Intent(this, historyActivity::class.java)
                startActivity(intent)
            }
            if(position == 1){
                Toast.makeText(this@MainActivity,"You click on Charges",Toast.LENGTH_LONG).show()
                val intent = Intent(this, chargesActivity::class.java)
                startActivity(intent)
            }
            if(position == 2){
                Toast.makeText(this@MainActivity,"You click on Info",Toast.LENGTH_LONG).show()
                val intent = Intent(this, infoActivity::class.java)
                startActivity(intent)
            }
            if(position == 3){
                Toast.makeText(this@MainActivity,"You click on Download",Toast.LENGTH_LONG).show()
                val intent = Intent(this, downloadActivity::class.java)
                startActivity(intent)
            }
            if(position == 4){
                Toast.makeText(this@MainActivity,"You click on Register / Login",Toast.LENGTH_LONG).show()
                val intent = Intent(this, registerActivity::class.java)
                startActivity(intent)
            }

        }

    }
}
