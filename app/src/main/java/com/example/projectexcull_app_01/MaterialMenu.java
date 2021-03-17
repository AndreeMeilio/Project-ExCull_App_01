package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MaterialMenu extends AppCompatActivity {
    private TextView back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_menu);

        back_button = (TextView) findViewById(R.id.material_menu_back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_into_users_assignment = new Intent(getApplicationContext(), UsersAssignmentList.class);
                startActivity(back_into_users_assignment);
                finish();
            }
        });
    }
}