package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setSupportActionBar(toolbarčina)
        toolbarčina.setNavigationOnClickListener {
            Toast.makeText(this, "evo mene tolbar", Toast.LENGTH_LONG).show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menui, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "you clicked on add contact", Toast.LENGTH_LONG).show()
            R.id.miSettings -> Toast.makeText(this, "you clicked on add contact", Toast.LENGTH_LONG).show()
        }
        return true
    }

}