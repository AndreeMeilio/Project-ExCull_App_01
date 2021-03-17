package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClubMenu extends AppCompatActivity {
    private TextView backto_user_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_menu);

        backto_user_about = (TextView) findViewById(R.id.menuclub_back_to_profile);
        backto_user_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_about_profile = new Intent(getApplicationContext(), UsersAboutActivity.class);
                startActivity(into_about_profile);
                finish();
            }
        });
    }
}