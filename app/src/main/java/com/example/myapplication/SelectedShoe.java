package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SelectedShoe extends AppCompatActivity {

    TextView selectedShoeName;
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

        selectedShoeName = findViewById(R.id.txtName);
        intent = getIntent();

        if (intent != null){
            shoeModel = (ShoeModel) intent.getSerializableExtra("data");
            String name = shoeModel.getName();
            selectedShoeName.setText(name);
        }
    }
}