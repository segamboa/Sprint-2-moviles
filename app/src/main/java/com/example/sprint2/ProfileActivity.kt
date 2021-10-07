package com.example.sprint2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.profile))

        setContentView(R.layout.perfil)


        val actionBar = supportActionBar
        actionBar!!.title = Html.fromHtml("<font color='#000000'>Mi perfil</font>");

        if (actionBar != null) {

            // Customize the back button
            actionBar.setHomeAsUpIndicator(R.drawable.arrow);

            // showing the back button in action bar
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
}