package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Communities extends AppCompatActivity {
    TextView discordlink;
    TextView GRlink;
    TextView FBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communities);

        discordlink = findViewById(R.id.link);
        discordlink.setMovementMethod(LinkMovementMethod.getInstance());

        GRlink = findViewById(R.id.linkgood);
        GRlink.setMovementMethod(LinkMovementMethod.getInstance());

        FBlink = findViewById(R.id.linkfacebook);
        FBlink.setMovementMethod(LinkMovementMethod.getInstance());

    }
}