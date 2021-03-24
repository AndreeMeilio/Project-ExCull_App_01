package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ClubMenu extends AppCompatActivity {
    private TextView backto_user_about;

    private RelativeLayout club_menu_assignment, club_menu_chatroom, club_menu_hof;

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

        club_menu_assignment = (RelativeLayout) findViewById(R.id.club_menu_assignment);
        club_menu_assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent club_menu_into_assignmnet = new Intent(getApplicationContext(), Assignments.class);
                startActivity(club_menu_into_assignmnet);
                finish();
            }
        });
        club_menu_chatroom = (RelativeLayout) findViewById(R.id.club_menu_chatroom);
        club_menu_hof = (RelativeLayout) findViewById(R.id.club_menu_hof);
        club_menu_hof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent club_menu_into_hof = new Intent(getApplicationContext(), HalfOfFame.class);
                startActivity(club_menu_into_hof);
                finish();
            }
        });
    }
}