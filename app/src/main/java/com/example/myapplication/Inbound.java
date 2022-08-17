package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.*;
import com.google.zxing.Result;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Inbound extends AppCompatActivity {
    private static final int CAMERA_PERMISSION_CODE = 100;
    private CodeScanner mCodeScanner;
    private Object result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbound);

        checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);

        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);

        mCodeScanner.setScanMode(ScanMode.SINGLE);
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(Inbound.this, result.getText(), Toast.LENGTH_SHORT).show();
                        scanResult(result.getText());
                    }
                });
            }
        });

         scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
            }
        });

        Button btnTestButton = findViewById(R.id.testButton);
        Button btnTestButton2 = findViewById(R.id.testButton2);

        btnTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scanResult("100013202");
            }
        });

        btnTestButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scanResult("100013203");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCodeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }

    // Function to check and request permission.
    public void checkPermission(String permission, int requestCode)
    {
        if (ContextCompat.checkSelfPermission(Inbound.this, permission) == PackageManager.PERMISSION_DENIED) {

            // Requesting the permission
            ActivityCompat.requestPermissions(Inbound.this, new String[] { permission }, requestCode);
        }
        else {
            Toast.makeText(Inbound.this, "Permission already granted", Toast.LENGTH_SHORT).show();
        }
    }

    // This function is called when the user accepts or decline the permission.
    // Request Code is used to check which permission called this function.
    // This request code is provided when the user is prompt for permission.

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,
                permissions,
                grantResults);

        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Inbound.this, "Camera Permission Granted", Toast.LENGTH_SHORT) .show();
            }
            else {
                Toast.makeText(Inbound.this, "Camera Permission Required", Toast.LENGTH_SHORT) .show();
            }
        }
    }

    Map<String, Shoe> inventory = new HashMap<>();
    @SuppressLint("SetTextI18n")
    public void scanResult(String result){
        TextView barcodeScan, productInfo, scanCount;
        barcodeScan = findViewById(R.id.barcodeScan);
        productInfo = findViewById(R.id.productInfo);
        scanCount = findViewById(R.id.scanCount);

        // Display scanned code
        barcodeScan.setText((CharSequence) result);

        // Create or edit shoe class object
        Shoe shoe = null;
        if(inventory.containsKey(result)) {
            // Increment on existing inventory object
            shoe = inventory.get(result);
            Log.d("Inventory", "Old");
        } else {
            // Create new shoe object
            inventory.put(result, (Shoe) CreateShoeObj(result));
            shoe = inventory.get(result);
            Log.d("Inventory", "New");
        }

        Objects.requireNonNull(shoe).count += 1;
        productInfo.setText(MessageFormat.format("Name: {0} Size: {1} Color: {2}", shoe.name, shoe.size, shoe.color));
        scanCount.setText(shoe.count.toString());
    }

    private Object CreateShoeObj(String result) {
        try {
            Class<?> c = Class.forName("com.example.myapplication.Shoe");
            Constructor<?> con = c.getConstructor(String.class);
            return (Shoe) con.newInstance(result);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}