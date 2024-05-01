package com.example.adaptaon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement( "Antoni","Sala1","Activo"));
        elements.add(new ListElement("Marcos","Sala1","Activo"));
        elements.add(new ListElement("Daniela","Sala3","Desactivado"));
        elements.add(new ListElement("Pamela","Sala2","Activo"));
        elements.add(new ListElement("Mary","Sala2","Desactivado"));
        elements.add(new ListElement("Felipe","Sala2","Activado"));
        elements.add(new ListElement("Mauro","Sala3","Activado"));
        elements.add(new ListElement("Vanessa","Sala1","Activado"));


        ListAdapter listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(ListElement item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
        recyclerView.setAdapter(listAdapter);
    }

    public void moveToDescription(ListElement item){
        Intent intent=new Intent(this,DescriptionActivity.class);
        intent.putExtra("ListElement",item);
        startActivity(intent);
    }
}