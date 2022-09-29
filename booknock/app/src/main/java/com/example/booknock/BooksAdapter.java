package com.example.booknock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BooksAdapter extends RecyclerView.Adapter {
    ArrayList<AllBooks> thebooks = new ArrayList<>();
    Context context;

public BooksAdapter (ArrayList<AllBooks> thebooks,Context context) {
    this.thebooks = thebooks;
    this.context = context;
}


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rawitems, parent,false );
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder,@SuppressLint("RecyclerView") int position) {
        ((ViewHolder)holder).bookname.setText(thebooks.get(position).getBookName());
        ((ViewHolder)holder).bookauthor.setText(thebooks.get(position).getBookAuthor());
        ((ViewHolder)holder).img.setImageResource(thebooks.get(position).getBookImg());
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentv = new Intent(context,DetailsActivity.class);
                intentv.putExtra("book",thebooks.get(position));
                context.startActivity(intentv);
            }
        });

    }

    @Override
    public int getItemCount() {
        return thebooks.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
    View v;
    TextView bookname,bookauthor;
    ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
             img = v.findViewById(R.id.imageView4);
             bookname = v.findViewById(R.id.textView6);
             bookauthor = v.findViewById(R.id.textView7);
        }
    }
}
