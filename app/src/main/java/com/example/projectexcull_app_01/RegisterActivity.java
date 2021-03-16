package com.example.projectexcull_app_01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";

    private Button register_button;
    private TextView register_into_login;

    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Log.d(TAG, "onCreate: start");

        builder = new AlertDialog.Builder(this);

        register_button = (Button) findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Confirmation")
                        .setMessage("Are you sure with your current data?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Registration Successfully", Toast.LENGTH_LONG).show();
                                Intent into_login_activity = new Intent(getApplicationContext(), LoginActivity.class);
                                finish();
                                startActivity(into_login_activity);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        register_into_login = (TextView) findViewById(R.id.register_into_login);
        register_into_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into_login_activity = new Intent(getApplicationContext(), LoginActivity.class);
                finish();
                startActivity(into_login_activity);
            }
        });
    }
}