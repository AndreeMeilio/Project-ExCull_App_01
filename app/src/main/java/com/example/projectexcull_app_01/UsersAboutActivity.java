package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UsersAboutActivity extends AppCompatActivity {
    private TextView users_logout, users_home;
    private ImageView tambah_club, orbit_club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_about);

        users_logout = (TextView) findViewById(R.id.users_about_logout);
        users_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_login_activity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(into_login_activity);
                finish();
            }
        });

        users_home = (TextView) findViewById(R.id.users_about_home);
        users_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_assignment_list = new Intent(getApplicationContext(), UsersAssignmentList.class);
                startActivity(into_assignment_list);
                finish();
            }
        });

        tambah_club = (ImageView) findViewById(R.id.tambah_club);
        tambah_club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_join_club = new Intent(getApplicationContext(), JoinClub.class);
                startActivity(into_join_club);
                finish();
            }
        });

        orbit_club = (ImageView) findViewById(R.id.users_club_1);
        orbit_club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_club_menu = new Intent(getApplicationContext(), ClubMenu.class);
                startActivity(into_club_menu);
                finish();
            }
        });
    }
}