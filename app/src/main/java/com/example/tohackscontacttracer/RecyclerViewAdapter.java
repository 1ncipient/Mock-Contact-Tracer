package com.example.tohackscontacttracer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    private ArrayList<UniqueLocation> entries = new ArrayList<>();


    public RecyclerViewAdapter (ArrayList <UniqueLocation> entries){
        this.entries = entries;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.location.setText(entries.get(i).getLocation());
        holder.time.setText(entries.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return entries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView location;
        private TextView time;


        LinearLayout linearLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            location = itemView.findViewById(R.id.location);
            time = itemView.findViewById(R.id.time);
        }
    }
}
