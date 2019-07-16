package com.example.phase1_challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private Button About;
    private  Button myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar =(Toolbar)findViewById(R.id.main_app_layout);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ALC 4 Phase 1");

        About= (Button)findViewById(R.id.About_button);
        myprofile =(Button)findViewById(R.id.myprofile_button);

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });


        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,profileActivity.class);
                startActivity(intent);
            }
        });
    }
}
