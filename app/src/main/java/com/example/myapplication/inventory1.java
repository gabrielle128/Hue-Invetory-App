package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class inventory1 extends AppCompatActivity implements ShoeAdapter.ShoeClickListener{

    SearchView searchView;
    RecyclerView recyclerView;
    ShoeAdapter shoeAdapter;
    List<ShoeModel> shoeModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory1);

        searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.recyclerView);

        displaySearch();
        setData();
        displayRV();

    }

    // filtered list for searchView
    private void displaySearch() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<ShoeModel> filteredList = new ArrayList<>();
                for (ShoeModel item: shoeModelList){
                    if (item.getName().toLowerCase().contains(newText.toLowerCase())){
                        filteredList.add(item);
                    }
                    shoeAdapter.filterList(filteredList);
                }
                return true;
            }
        });
    }

    // data for shoe names
    public void setData(){
        shoeModelList.add(new ShoeModel("Ada Biscotti", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Black", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Bleu", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Blush", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Daffodil", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Fleur", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Golden", null, null, null));
        shoeModelList.add(new ShoeModel("Ada Periwinkle", null, null, null));
        shoeModelList.add(new ShoeModel("Ada White", null, null, null));
        shoeModelList.add(new ShoeModel("Adria Le Blanc", null, null, null));
        shoeModelList.add(new ShoeModel("Adria Naturale", null, null, null));
        shoeModelList.add(new ShoeModel("Adria Toscana", null, null, null));
        shoeModelList.add(new ShoeModel("Akalia Palomino", null, null, null));
        shoeModelList.add(new ShoeModel("Akalia White", null, null, null));
        shoeModelList.add(new ShoeModel("Alaia Biscotti", null, null, null));
        shoeModelList.add(new ShoeModel("Alaia Creme", null, null, null));
        shoeModelList.add(new ShoeModel("Alaia Fleur", null, null, null));
        shoeModelList.add(new ShoeModel("Alaia Toscana", null, null, null));
        shoeModelList.add(new ShoeModel("Alana Black", null, null, null));
        shoeModelList.add(new ShoeModel("Alana Bleu", null, null, null));
    }

    public void displayRV(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        setAdapter();
    }

    public void setAdapter(){
        shoeAdapter = new ShoeAdapter(shoeModelList, this, this::selectedShoe);
        recyclerView.setAdapter(shoeAdapter);
    }

    @Override
    public void selectedShoe(ShoeModel shoeModel) {
        startActivity(new Intent(this, inventory_details.class).putExtra("data", shoeModel));
    }
}