package com.example.mcqbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void Signup(View view) {
        Intent intent = new Intent(getApplicationContext(),Signup.class);
        startActivity(intent);
    }


    public void ForgetPassword(View view) {
        Intent intent = new Intent(getApplicationContext(),ForgetPassword.class);
        startActivity(intent);
    }
}
