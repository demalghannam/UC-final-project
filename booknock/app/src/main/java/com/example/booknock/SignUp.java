package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        EditText username = findViewById(R.id.username);
        EditText userage = findViewById(R.id.userage);
        EditText useremail = findViewById(R.id.userEmail);
        EditText userpass = findViewById(R.id.userPassword);


        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String a = username.getText().toString();
                String b = userage.getText().toString();
                String c = useremail.getText().toString();
                String d = userpass.getText().toString();


                Intent intent2 = new Intent(SignUp.this,myaccount.class);
                intent2.putExtra("name",a);
                intent2.putExtra("age",b);
                intent2.putExtra("email",c);
                intent2.putExtra("pass",d);
                startActivity(intent2);


            }

        });

    }
}