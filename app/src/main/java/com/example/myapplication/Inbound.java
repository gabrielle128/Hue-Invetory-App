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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Inbound extends AppCompatActivity {
    private static final int CAMERA_PERMISSION_CODE = 100;
    private CodeScanner mCodeScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbound);

        checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);

        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);

        mCodeScanner.setScanMode(ScanMode.SINGLE);
        mCodeScanner.setDecodeCallback(result -> runOnUiThread(() -> {
            //Toast.makeText(Inbound.this, result.getText(), Toast.LENGTH_SHORT).show();
            scanResult(result.getText());
        }));

         scannerView.setOnClickListener(view -> mCodeScanner.startPreview());

        Button btnTestButton = findViewById(R.id.testButton);
        Button confirmBtn = findViewById(R.id.confirmBtn);
        Button manualAddBtn = findViewById(R.id.manualAddBtn);

        // Button for testing
        btnTestButton.setOnClickListener(view -> scanResult("100013202"));

        // Confirm button to update the database
        confirmBtn.setOnClickListener(view -> scanResult("100013203"));

        // Manually add item to database, if scanner is not working
        manualAddBtn.setOnClickListener(view -> {
            EditText barcodeText = (EditText) findViewById(R.id.barcodeManualAdd);
            scanResult(barcodeText.getText().toString());
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
    public void checkPermission(String permission, int requestCode) {
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
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                Toast.makeText(Inbound.this, "Camera Permission Granted", Toast.LENGTH_SHORT) .show();
            else
                Toast.makeText(Inbound.this, "Camera Permission Required", Toast.LENGTH_SHORT) .show();
        }
    }

    Map<String, Shoe> inventory = new HashMap<>();
    @SuppressLint("SetTextI18n")
    public void scanResult(String result){
        Log.d("Result", result);
        TextView barcodeScan, productInfo, scanCount;
        barcodeScan = findViewById(R.id.barcodeScan);
        productInfo = findViewById(R.id.productInfo);
        scanCount = findViewById(R.id.scanCount);

        // Display scanned code
        barcodeScan.setText((CharSequence) result);

        // Create or edit shoe object
        Shoe shoe;
        if(inventory.containsKey(result)) {
            // Increment on existing inventory object
            shoe = inventory.get(result);
            Log.d("Inventory", "Old");
        } else {
            // Check if barcode is valid or invalid
            if(CheckItemDB(result)) {
                // Create new shoe object
                inventory.put(result, (Shoe) CreateShoeObj(result));
                shoe = inventory.get(result);
                Log.d("Inventory", "New");
            } else {
                Toast.makeText(this, "ITEM NOT FOUND IN DATABASE", Toast.LENGTH_LONG).show();
                return;
            }
        }

        // Update count and product information
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

    private boolean CheckItemDB(String result) {
        // Replace code with check if item exists in the database
        return result.length() == 9;
    }
}