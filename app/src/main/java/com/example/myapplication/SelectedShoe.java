package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SelectedShoe extends AppCompatActivity {

    TextView selectedShoeName, barcode5, barcode6, barcode7, barcode8, barcode9, quantity5, quantity6, quantity7, quantity8, quantity9;
    ShoeModel shoeModel;
    Intent intent;
    ImageView backBtn, menupopbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_shoe);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Inventory.class)));

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

        barcode5 = findViewById(R.id.txtBarcode5);
        barcode6 = findViewById(R.id.txtBarcode6);
        barcode7 = findViewById(R.id.txtBarcode7);
        barcode8 = findViewById(R.id.txtBarcode8);
        barcode9 = findViewById(R.id.txtBarcode9);

        quantity5 = findViewById(R.id.txtQuantity5);
        quantity6 = findViewById(R.id.txtQuantity6);
        quantity7 = findViewById(R.id.txtQuantity7);
        quantity8 = findViewById(R.id.txtQuantity8);
        quantity9 = findViewById(R.id.txtQuantity9);

        selectedShoeName = findViewById(R.id.txtName);
        intent = getIntent();

        if (intent != null){
            shoeModel = (ShoeModel) intent.getSerializableExtra("data");
            String name = shoeModel.getName();
            selectedShoeName.setText(name);

            // getting first & second word of selectedShoeName
            String strSplit[] = name.split(" ");
            String design = strSplit[0];
            String desName = strSplit[1];

            DatabaseReference reference = FirebaseDatabase.getInstance("https://ojt-app-cfbb0-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("Hue").child(design).child(desName);

            reference.child("size_5").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        String barcode = snapshot.child("barcode").getValue().toString();
                        barcode5.setText(barcode);
                        String quantity = snapshot.child("quantity").getValue().toString();
                        quantity5.setText(quantity);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            reference.child("size_6").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        String barcode = snapshot.child("barcode").getValue().toString();
                        barcode6.setText(barcode);
                        String quantity = snapshot.child("quantity").getValue().toString();
                        quantity6.setText(quantity);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            reference.child("size_7").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        String barcode = snapshot.child("barcode").getValue().toString();
                        barcode7.setText(barcode);
                        String quantity = snapshot.child("quantity").getValue().toString();
                        quantity7.setText(quantity);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            reference.child("size_8").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        String barcode = snapshot.child("barcode").getValue().toString();
                        barcode8.setText(barcode);
                        String quantity = snapshot.child("quantity").getValue().toString();
                        quantity8.setText(quantity);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

            reference.child("size_9").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        String barcode = snapshot.child("barcode").getValue().toString();
                        barcode9.setText(barcode);
                        String quantity = snapshot.child("quantity").getValue().toString();
                        quantity9.setText(quantity);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }
    }
}