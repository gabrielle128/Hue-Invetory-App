package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class FindLocation extends AppCompatActivity  implements View.OnClickListener {
    public static TextView input;


    TextView result, resulttextview;
    ImageButton cameraBtn;
    Button search, scan_btn, barcodebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan);

        resulttextview = findViewById(R.id.input);

        scan_btn=findViewById(R.id.barcodebutton);

        cameraBtn = findViewById(R.id.camera_png);
        cameraBtn.setOnClickListener(this);

        search = findViewById(R.id.show);
        input = findViewById(R.id.input);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FindLocation2.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo();
            }
        });

    }

    @Override
    public void onClick(View v) {
        scanCode();
    }

    private void scanCode(){

        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(CaptureAct.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning Code");
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if(result.getContents() != null){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(result.getContents());
                builder.setTitle("Scanning Result");
                builder.setPositiveButton("Scan Again", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scanCode();
                    }
                }).setNegativeButton("finish", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
            else {
                Toast.makeText(this, "No Results Found", Toast.LENGTH_LONG).show();
            }
        }else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


    private void showInfo() {
        AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.showlocation, null);
        myDialog.setView(view);
        final AlertDialog dialog = myDialog.create();

        final TextView information = view.findViewById(R.id.information);
        final TextView name = view.findViewById(R.id.name);
        final TextView size = view.findViewById(R.id.size);
        final TextView location = view.findViewById(R.id.location);
        final TextView done = view.findViewById(R.id.done);

        String barcode = input.getText().toString().trim();

        if (barcode.equals("0912345")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("6");
            location.setText("rack 6");
            done.setText("done");
        }

        if (barcode.equals("0912346")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("6");
            location.setText("rack 6");
            done.setText("done");
        }

        if (barcode.equals("0912347")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("7");
            location.setText("rack 7");
            done.setText("done");
        }

        if (barcode.equals("0912348")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("8");
            location.setText("rack 8");
            done.setText("done");
        }

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}