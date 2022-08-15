package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.*;
import com.google.zxing.Result;

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
                Toast.makeText(Inbound.this, "Camera Permission Denied", Toast.LENGTH_SHORT) .show();
            }
        }
    }

    public void scanResult(String result) {
        TextView barcodeScan, productInfo, scanCount;
        barcodeScan = findViewById(R.id.barcodeScan);
        productInfo = findViewById(R.id.productInfo);
        scanCount = findViewById(R.id.scanCount);

        barcodeScan.setText((CharSequence) result);

        int count = Integer.parseInt(scanCount.getText().toString()) + 1;
        scanCount.setText(String.valueOf(count));

        Shoe shoe = new Shoe((String) result);
        productInfo.setText("Name: " + shoe.name + " Size: " + shoe.size + " Color: " + shoe.color);
    }
}