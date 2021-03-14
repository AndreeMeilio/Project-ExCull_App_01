package com.example.projectexcull_app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText login_username, login_password;
    private Button login_button;
    private TextView login_into_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_username = (EditText) findViewById(R.id.login_username);
        login_password = (EditText) findViewById(R.id.login_password);

        login_into_signup = (TextView) findViewById(R.id.login_into_register);
        login_into_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_signup_activity = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(into_signup_activity);
            }
        });

        login_button = (Button) findViewById(R.id.login_button);
    }
}