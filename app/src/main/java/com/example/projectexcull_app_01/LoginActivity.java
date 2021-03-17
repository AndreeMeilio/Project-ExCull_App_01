package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private EditText login_username, login_password;
    private Button login_button;
    private TextView login_into_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate: start");

        login_username = (EditText) findViewById(R.id.login_username);

        login_password = (EditText) findViewById(R.id.login_password);

        login_into_register = (TextView) findViewById(R.id.login_into_register);
        login_into_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_register_activity = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(into_register_activity);
            }
        });

        login_button = (Button) findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = login_username.getText().toString();
                String password = login_password.getText().toString().trim();
                boolean emptyField = false;

                if (username.equalsIgnoreCase("")){
                    login_username.setError("Please Insert Your Username");
                    emptyField = true;
                }
                if (password.equalsIgnoreCase("")){
                    login_password.setError("Please Insert Your Password");
                    emptyField = true;
                }
                if (!emptyField){
                    Intent into_profile_activity = new Intent(getApplicationContext(), UsersAssignmentList.class);
                    overridePendingTransition(0, 0);
                    into_profile_activity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(into_profile_activity);
                }
            }
        });
    }
}