package com.example.myapplication;

import android.util.Log;

import java.lang.Math;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Shoe {
    DatabaseReference reference = FirebaseDatabase.getInstance("https://ojt-app-cfbb0-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("Hue");
    String product_code, product_color_code, product_size_code;
    String name, color, bounds;
    Integer size, count;
    Boolean exists;

    // Event Listener
    private DatabaseListener OnDatabaseEventListener;
    public void setDatabaseListener(DatabaseListener dbListener) {
        OnDatabaseEventListener = dbListener;
    }

    public Shoe(String code, String bounds) {
        product_code = code.substring(0, 7);
        product_color_code = code.substring(7, 10);
        product_size_code = code.substring(10, 12);
        size = (int) Math.sqrt(Integer.parseInt(product_size_code));
        this.bounds = bounds;
    }

    public void findData(String code) {
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot product_data : snapshot.getChildren()) {
                    String design_value = product_data.child("design_code").getValue().toString();
                    if(design_value.equals(product_code)) {
                        name = product_data.getKey();
                        for(DataSnapshot color_data : product_data.getChildren()) {
                            color = color_data.getKey();
                            if(color_data.child("size_" + size).child("barcode").getValue().toString().equals(code)) {
                                exists = true;
                                count = Integer.parseInt(color_data.child("size_" + size).child("quantity").getValue().toString());
                                if(bounds.equals("inbound")) {
                                    increment();
                                } else if(bounds.equals("outbound")) {
                                    decrement();
                                }
                                Log.d("FIREBASE", name + color + size + count);
                            } else {
                                exists = false;
                            }
                            return;
                        }
                    }
                }
                exists = false;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void increment() {
        count += 1;

        if(OnDatabaseEventListener != null) {
            OnDatabaseEventListener.OnCallUpdateInfo();
        }
    }

    public void decrement() {
        count -= 1;

        if(OnDatabaseEventListener != null) {
            OnDatabaseEventListener.OnCallUpdateInfo();
        }
    }

    public void writeData() {

    }
}