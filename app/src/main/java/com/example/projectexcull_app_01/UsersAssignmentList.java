package com.example.projectexcull_app_01;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class UsersAssignmentList extends AppCompatActivity {

    private String[] task_name;
    private String[] teacher;
    private String[] deadline;

    private RecyclerView assignment_recyclerview;
    private RelativeLayout assignment_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_assignment_list);

        task_name = getResources().getStringArray(R.array.task_name);
        teacher = getResources().getStringArray(R.array.teacher_name);
        deadline = getResources().getStringArray(R.array.deadline);

        AssignmentListAdapter adapter = new AssignmentListAdapter(this, task_name, teacher, deadline);
        assignment_recyclerview = (RecyclerView) findViewById(R.id.assignment_recycler);
        assignment_recyclerview.setAdapter(adapter);
        assignment_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        assignment_recyclerview.addOnItemTouchListener( new RecyclerItemClickListener(getApplicationContext(), assignment_recyclerview ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent into_material_menu = new Intent(getApplicationContext(), MaterialMenu.class);
                        startActivity(into_material_menu);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

        assignment_profile = (RelativeLayout) findViewById(R.id.assignment_profile);
        assignment_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_users_about = new Intent(getApplicationContext(), UsersAboutActivity.class);
                startActivity(into_users_about);
                finish();
            }
        });
    }
}