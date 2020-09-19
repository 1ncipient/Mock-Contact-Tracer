package com.example.tohackscontacttracer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class TodaysLocations extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<UniqueLocation> allLocations = new ArrayList<UniqueLocation>();
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todays_location);

        recyclerView = findViewById(R.id.todaysLocationsRView);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(allLocations);
        recyclerView.setAdapter(recyclerViewAdapter);

        sampleArrayList();

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TodaysLocations.this, MainActivity.class);
                startActivity (intent);
            }
        });
    }

    private void sampleArrayList() {
        UniqueLocation uniqueLocation = new UniqueLocation("3600 Queens Street", "03:00");
        allLocations.add(uniqueLocation);
        UniqueLocation uniqueLocation2 = new UniqueLocation("3600 Queens Street", "04:00");
        allLocations.add(uniqueLocation);
        UniqueLocation uniqueLocation3 = new UniqueLocation("3600 Queens Street", "05:00");
        allLocations.add(uniqueLocation);

    }
}
