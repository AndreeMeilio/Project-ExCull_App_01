package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HalfOfFame extends AppCompatActivity {
    private String hof_username[], hof_rank[];

    private TextView hof_backto_club_menu;

    private RecyclerView hof_recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half_of_fame);

        hof_rank = getResources().getStringArray(R.array.hof_rank);
        hof_username = getResources().getStringArray(R.array.hof_username);

        HofAdapter hof_adapter = new HofAdapter(this, hof_rank, hof_username);

        hof_recycler_view = (RecyclerView) findViewById(R.id.hof_recycler_view);
        hof_recycler_view.setAdapter(hof_adapter);
        hof_recycler_view.setLayoutManager(new LinearLayoutManager(this));

        hof_backto_club_menu = (TextView) findViewById(R.id.hof_backto_club_menu);
        hof_backto_club_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hof_into_club_menu = new Intent(getApplicationContext(), ClubMenu.class);
                startActivity(hof_into_club_menu);
                finish();
            }
        });
    }
}