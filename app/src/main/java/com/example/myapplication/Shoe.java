package com.example.myapplication;

import android.util.Log;
import java.lang.Math;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.MessageFormat;

public class Shoe {
    DatabaseReference reference = FirebaseDatabase.getInstance("https://ojt-app-cfbb0-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("Hue");

    String product_code, product_color_code, product_size_code;
    String name;
    String color;
    Integer size;
    Integer count = 0;

    public Shoe(String code) {
        //database.put("10001", "LeBlanc");
        //database.put("02", "beige");
        //database.put("03", "white");

        product_code = code.substring(0, 7);
        product_color_code = code.substring(7, 10);
        product_size_code = code.substring(10, 12);

        size = (int) Math.sqrt(Integer.parseInt(product_size_code));

        //name = database.get(code.substring(0, 5));
        //size = code.substring(5, 7);
        //color = database.get(code.substring(7, 9));
        findData(code);
    }

    private void findData(String code) {
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data : snapshot.getChildren()) {
                    String design_value = data.child("design_code").getValue().toString();
                    if(design_value.equals(product_code)) {
                        name = data.getKey();
                        for(DataSnapshot color_data : data.getChildren()) {
                            if(color_data.child("color_code").getValue().toString().equals(product_color_code)) {
                                color = color_data.getKey();
                                if(!color_data.child("size_" + size).child("barcode").getValue().toString().equals(code)) {
                                    noData();
                                    return;
                                }
                                count = Integer.parseInt(color_data.child("size_" + size).child("quantity").getValue().toString());
                                count = Integer.parseInt(String.valueOf(count)) + 1;
                                return;
                            }
                        }
                    }
                }
                noData();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void noData(){
        name = null;
        size = null;
        color = null;
        count = 0;

        Log.d("FIREBASE", "NO DATA");
    }

    public void writeData() {
        if(name != null) {
            reference.child(name).child(color).child("size_" + size.toString()).child("quantity").setValue(count);
            Log.d("UPDATE", MessageFormat.format("{0} {1} size {2} updated", name, color, size));
        }
    }
}

