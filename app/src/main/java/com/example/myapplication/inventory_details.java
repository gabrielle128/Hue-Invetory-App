package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class inventory_details extends AppCompatActivity {

    TextView selectedShoeName;
    ShoeModel shoeModel;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_details);

        selectedShoeName = findViewById(R.id.txtName);
        intent = getIntent();

        if (intent != null){
            shoeModel = (ShoeModel) intent.getSerializableExtra("data");
            String name = shoeModel.getName();
            selectedShoeName.setText(name);
        }

    }
}