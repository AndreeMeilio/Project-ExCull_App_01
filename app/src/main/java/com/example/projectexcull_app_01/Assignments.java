package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Assignments extends AppCompatActivity {
    private TextView assignment_backto_profile, assignment_backto_clubmenu;

    private RecyclerView assigment_recycler;

    private String[] assignment_title;
    private int[] assignment_logo= {
            R.drawable.group_112,
            R.drawable.group_113,
            R.drawable.group_114,
            R.drawable.group_113,
            R.drawable.group_113,
            R.drawable.group_115,
            R.drawable.group_112,
            R.drawable.group_114,
            R.drawable.group_115,
            R.drawable.group_115
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);

        assignment_backto_profile = (TextView) findViewById(R.id.assignment_backto_profile);
        assignment_backto_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_into_profile = new Intent(getApplicationContext(), UsersAboutActivity.class);
                startActivity(back_into_profile);
                finish();
            }
        });

        assignment_backto_clubmenu = (TextView) findViewById(R.id.assignment_clubmenu);
        assignment_backto_clubmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_into_clubmenu = new Intent(getApplicationContext(), ClubMenu.class);
                startActivity(back_into_clubmenu);
                finish();
            }
        });

        assignment_title = getResources().getStringArray(R.array.assignment_title);

        AssignmentAdapter assignment_adapter = new AssignmentAdapter(this, assignment_logo, assignment_title);
        assigment_recycler = (RecyclerView) findViewById(R.id.assignment_task_recycler);
        assigment_recycler.setAdapter(assignment_adapter);
        assigment_recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}