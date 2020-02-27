package com.adjav.game.bored;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Element adsElement = new Element();
        adsElement.setTitle("Advertise with us");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)  
                .setDescription("This is a demo version")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem(adsElement)
                .addGroup("Connect with us")
                .addGitHub("carlsontabije")
                .addEmail("carlsontabije@gmail.com")
                .addEmail("chinomungcal1596@gmail.com")
                .addFacebook("haveyouseenthisman")
                .addFacebook("carlson.tabs")
                .addTwitter("carlsontabiheyy")
                .addInstagram("carlsontabs")
                .addItem(createCopyrights())
                .create();

        setContentView(aboutPage);
    }

    private Element createCopyrights() {
        Element copyright = new Element();
        final String copyrightString = String.format("Copyright %d by Carlson&Chino", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIconDrawable(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(About.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
