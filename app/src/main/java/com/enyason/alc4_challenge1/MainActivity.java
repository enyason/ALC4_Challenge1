package com.enyason.alc4_challenge1;

import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAbout, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.btn_about_alc);
        btnProfile = findViewById(R.id.btn_my_profile);


        btnAbout.setOnClickListener(this);
        btnProfile.setOnClickListener(this);

    }




    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_about_alc:
                startActivity(new Intent(this, AboutActivity.class));
                break;
            case R.id.btn_my_profile:
                startActivity(new Intent(this, ProfileActivity.class));
                break;

        }
    }
}
