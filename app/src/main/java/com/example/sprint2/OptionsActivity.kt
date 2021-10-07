package com.example.sprint2

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.content.ContextCompat

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.options))

        setContentView(R.layout.opciones)


        val actionBar = supportActionBar
        actionBar!!.title = Html.fromHtml("<font color='#000000'>Opciones</font>");

        if (actionBar != null) {

            // Customize the back button
            actionBar.setHomeAsUpIndicator(R.drawable.arrow);

            // showing the back button in action bar
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        val textView4: TextView = findViewById<TextView>(R.id.textView4)
        textView4.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val textView5: TextView = findViewById<TextView>(R.id.textView5)
        textView5.setOnClickListener{
            val intent = Intent(this, MapaActivity::class.java)
            startActivity(intent)
        }

        val textView10: TextView = findViewById<TextView>(R.id.textView10)
        textView10.setOnClickListener{
            val intent = Intent(this, PrivacyActivity::class.java)
            startActivity(intent)
        }

        val textView11: TextView = findViewById<TextView>(R.id.textView11)
        textView11.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}