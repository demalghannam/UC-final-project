package com.example.booknock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Checklist extends AppCompatActivity implements QuantityListener {
    private Button button4;
    RecyclerView recycler_view;
    QuantityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        button4 = findViewById(R.id.button4) ;
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Checklist.this,Homepage.class);
                startActivity(intent3);
            }
        });

        recycler_view = findViewById(R.id.recycler_view);

        setRecyclerView();

    }
    private ArrayList<String> getQuantityData(){
      ArrayList<String> arrayList = new ArrayList<>();
      arrayList.add("Fiction");
      arrayList.add("Fantasy");
      arrayList.add("None Fiction");
      arrayList.add("thriller");
      arrayList.add("Arabic");
      return arrayList;
    }

    private void setRecyclerView(){
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QuantityAdapter(this,getQuantityData(),this);
        recycler_view.setAdapter(adapter);


    }

    @Override
    public void onQuantityChange(ArrayList<String> arrayList) {
        Toast.makeText(this,arrayList.toString(),Toast.LENGTH_SHORT).show();
    }



}

