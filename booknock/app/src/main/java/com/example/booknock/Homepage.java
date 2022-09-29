package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ImageButton whoarewe = findViewById(R.id.who);
        ImageButton commes = findViewById(R.id.com);
        ImageButton books = findViewById(R.id.books);




        whoarewe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentwho = new Intent(Homepage.this, whoarewe.class);
                startActivity(intentwho);

            }

        });

        commes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcom = new Intent(Homepage.this,Communities.class);
                startActivity(intentcom);
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbook = new Intent(Homepage.this,Books.class);
                startActivity(intentbook);
            }
        });
    }
}