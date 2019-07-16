package com.example.phase1_challenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class profileActivity extends AppCompatActivity {
    private Toolbar mtoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mtoolbar = (Toolbar)findViewById(R.id.profili_app_bar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("    "+ "My profile" );
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);

        }


    }
}
