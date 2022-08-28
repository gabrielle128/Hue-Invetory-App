package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ViewHolder> {

    public List<ShoeModel> shoeModelList = new ArrayList<>();
    public Context context;
    public ShoeClickListener shoeClickListener;

    public interface ShoeClickListener{
        void selectedShoe(ShoeModel shoeModel);
    }

    public ShoeAdapter(List<ShoeModel> shoeModels, Context context, ShoeClickListener shoeClickListener){
        this.shoeModelList = shoeModels;
        this.context = context;
        this.shoeClickListener = shoeClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.row_shoename, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ShoeModel shoeModel = shoeModelList.get(position);
        String name = shoeModel.getName();

        holder.shoeName.setText(name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoeClickListener.selectedShoe(shoeModel);
            }
        });

    }

    @Override
    public int getItemCount() {
        return shoeModelList.size();
    }

    // list for searchView
    public void filterList(List<ShoeModel> filteredList){
        shoeModelList = filteredList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView shoeName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            shoeName = itemView.findViewById(R.id.txtShoeName);
        }
    }

}
