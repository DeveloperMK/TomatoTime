package com.example.tomatotime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginBtn;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().length() >= 10){
                    Toast.makeText(Login.this, "Username must be shorter than 10 characters!", Toast.LENGTH_SHORT).show();
                    Intent tryAgain = new Intent(Login.this, Login.class);
                    startActivity(tryAgain);
                }

                else if(password.getText().length() >= 10){
                    Toast.makeText(Login.this, "Username must be shorter than 10 characters!", Toast.LENGTH_SHORT).show();
                    Intent tryAgain = new Intent(Login.this, Login.class);
                    startActivity(tryAgain);
                }

                Intent mainPage = new Intent(Login.this, Register.class); // Not "Register"...
                startActivity(mainPage);

            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerPage = new Intent(Login.this, Register.class);
                startActivity(registerPage);

            }
        });
    }
}