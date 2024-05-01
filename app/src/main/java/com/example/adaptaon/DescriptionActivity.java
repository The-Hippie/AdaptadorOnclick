package com.example.adaptaon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    TextView titleDescriptionTextView;
    TextView pcDescriptionTextView;
    TextView statusDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        ListElement element = (ListElement) getIntent().getSerializableExtra(  "ListElement");
        titleDescriptionTextView = findViewById(R.id.titleDescriptionTextView);
        pcDescriptionTextView = findViewById(R.id.pcDescriptionTextView);

        statusDescriptionTextView = findViewById(R.id.statusDescriptionTextView);
        titleDescriptionTextView.setText(element.getName());

        pcDescriptionTextView.setText(element.getPc());
        statusDescriptionTextView.setText(element.getStatus());

    }
}