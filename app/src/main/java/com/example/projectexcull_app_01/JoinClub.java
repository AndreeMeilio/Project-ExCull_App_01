package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class JoinClub extends AppCompatActivity {
    String nama_club[], pendiri[], jumlah_anggota[];
    int images_club[] = {
            R.drawable.logo_orbit,
            R.drawable.logo_nhk,
            R.drawable.logo_rohis,
            R.drawable.logo_badminton,
            R.drawable.logo_angklung,
            R.drawable.logo_debat1
    };

    private RecyclerView club_join_recycler;
    private RelativeLayout join_club_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_club);

        nama_club = getResources().getStringArray(R.array.nama_club);
        pendiri = getResources().getStringArray(R.array.pendiri);
        jumlah_anggota = getResources().getStringArray(R.array.jumlah_anggota);

        JoinClubAdapter adapter = new JoinClubAdapter(getApplicationContext(), nama_club, pendiri, jumlah_anggota, images_club);
        club_join_recycler = (RecyclerView) findViewById(R.id.recycler_join_club);
        club_join_recycler.setLayoutManager(new LinearLayoutManager(this));
        club_join_recycler.setAdapter(adapter);

        join_club_profile = (RelativeLayout) findViewById(R.id.assignment_profile);
        join_club_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_users_about = new Intent(getApplicationContext(), UsersAboutActivity.class);
                startActivity(into_users_about);
                finish();
            }
        });
    }
}