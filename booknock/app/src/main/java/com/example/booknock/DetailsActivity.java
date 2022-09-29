package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView bookname = findViewById(R.id.textdetail1);
        TextView bookauth = findViewById(R.id.textdetail2);
        TextView plot = findViewById(R.id.plot);
        ImageView imgbook = findViewById(R.id.imageViewd);

        Bundle bundlede = getIntent().getExtras();

        AllBooks sentbook = (AllBooks) bundlede.getSerializable("book");

        bookname.setText(sentbook.getBookName());
        bookauth.setText(sentbook.getBookAuthor());
        imgbook.setImageResource(sentbook.getBookImg());
        plot.setText(sentbook.getPlot());





    }
}