package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class UsersAssignmentList extends AppCompatActivity {

    private String[] task_name;
    private String[] teacher;
    private String[] deadline;

    private RecyclerView assignment_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_assignment_list);

        task_name = getResources().getStringArray(R.array.task_name);
        teacher = getResources().getStringArray(R.array.teacher_name);
        deadline = getResources().getStringArray(R.array.deadline);

        AssignmentAdapter adapter = new AssignmentAdapter(this, task_name, teacher, deadline);
        assignment_recyclerview = (RecyclerView) findViewById(R.id.assignment_recycler);
        assignment_recyclerview.setAdapter(adapter);
        assignment_recyclerview.setLayoutManager(new LinearLayoutManager(this));
    }
}