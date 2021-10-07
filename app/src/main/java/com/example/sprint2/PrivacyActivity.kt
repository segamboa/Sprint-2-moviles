package com.example.sprint2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html

class PrivacyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.privacy))
        setContentView(R.layout.politica_privacidad)

        val actionBar = supportActionBar
        actionBar!!.title = Html.fromHtml("<font color='#000000'>Política de Privacidad</font>");

        if (actionBar != null) {

            // Customize the back button
            actionBar.setHomeAsUpIndicator(R.drawable.arrow);

            // showing the back button in action bar
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}