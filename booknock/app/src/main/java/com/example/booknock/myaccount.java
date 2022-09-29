package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class myaccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myaccount);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");
        String email = bundle.getString("email");
        String pass = bundle.getString("pass");


        TextView username = findViewById(R.id.yourname);
        TextView userage = findViewById(R.id.yourage);
        TextView useremail = findViewById(R.id.yourEmail);
        TextView userpass = findViewById(R.id.yourtPassword);

        username.setText(name);
        userage.setText(age);
        useremail.setText(email);
        userpass.setText(pass);


        Button contbut = findViewById(R.id.button3);

        contbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(myaccount.this,Checklist.class);
                startActivity(intent6);
            }
        });








    }
}