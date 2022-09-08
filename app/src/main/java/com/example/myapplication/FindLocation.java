package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class FindLocation extends AppCompatActivity {
    public static TextView input;
    private DatabaseReference rootDatabaseref;

    private TextView scannedBarcode2, prdName2, prdColor2, prdSize2, prdLocation1;
    private Shoe shoe;

    Map<String, Shoe> inventory = new HashMap<>();
    String result;
    TextView resulttextview;

    ImageButton cameraBtn;
    ImageView backBtn, menupopbtn;
    Button search, scan_btn, barcodebutton, clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan);

        scannedBarcode2 = findViewById(R.id.input);
        prdLocation1 = findViewById(R.id.prdLocation1);
        EditText barcodeField = (EditText) findViewById(R.id.input);


        resulttextview = findViewById(R.id.input);

        scan_btn = findViewById(R.id.barcodebutton);

        search = findViewById(R.id.show);
        input = findViewById(R.id.input);

        rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("location");


        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FindLocation2.class));

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootDatabaseref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists())
                        {
                            String data = dataSnapshot.getValue().toString();
                            prdLocation1.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });

        backBtn = findViewById(R.id.backbtn1);
        backBtn.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        menupopbtn = findViewById(R.id.menupopbtn);
        menupopbtn.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(getApplicationContext(), menupopbtn);
            popupMenu.getMenuInflater().inflate(R.menu.option_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    switch (menuItem.getItemId()) {

                        case R.id.resetUserPassword:
                            startActivity(new Intent(getApplicationContext(), Resetpassword.class));
                            return true;

                        case R.id.logoutbtn:
                            FirebaseAuth.getInstance().signOut();
                            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                            finish();
                            return true;
                    }
                    return false;
                }
            });
            popupMenu.show();
        });

    }
    }















