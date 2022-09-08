package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ImageButton menupopbtn;
    Button Inventory, inbound, findlocation,aboutus, outbound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inbound = findViewById(R.id.btnInbound);
        inbound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Inbound.class));
            }
        });

        outbound = findViewById(R.id.btnOutbound);
        outbound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Outbound.class));
            }
        });

        findlocation = findViewById(R.id.btnFind);
        findlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FindLocation.class));
            }
        });
        Inventory = findViewById(R.id.btnInventory);
        Inventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Inventory.class));
            }
        });

        aboutus = findViewById(R.id.btnAbout);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AboutUs.class));
            }
        });

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