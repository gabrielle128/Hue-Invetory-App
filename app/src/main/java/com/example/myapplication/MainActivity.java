package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Outbound;
    ImageButton menupopbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Outbound = findViewById(R.id.btnInbound);
        Outbound.setOnClickListener(this);

        menupopbtn = findViewById(R.id.menupopbtn);
        menupopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), menupopbtn);
                popupMenu.getMenuInflater().inflate(R.menu.option_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){

                            case R.id.resetUserPassword:
                                startActivity(new Intent(getApplicationContext(),Resetpassword.class));
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
            }
        });

        }


    @Override
    public void onClick(View v) {
        scancode();


    }
    private void scancode(){
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(CaptureAct.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning Code");
        integrator.initiateScan();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result !=null){
            if(result.getContents() !=null){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(result.getContents());
                builder.setTitle("Scanning Result");
                builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        scancode();

                    }
                }).setNegativeButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
            else {
                Toast.makeText(this, "No Results", Toast.LENGTH_LONG).show();
            }

        }else {
            super.onActivityResult(requestCode, resultCode,data);
        }
    }
}