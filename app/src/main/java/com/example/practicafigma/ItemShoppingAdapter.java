package com.example.practicafigma;

// ItemShoppingAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemShoppingAdapter extends RecyclerView.Adapter<ItemShoppingAdapter.ItemViewHolder> {
    private Context context;
    private List<ItemShopping> ShopitemList;

    public ItemShoppingAdapter(List<ItemShopping> itemList) {
        this.ShopitemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shopping, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemShopping currentItem = ShopitemList.get(position);

        holder.ImageShop.setImageResource(currentItem.getImageResource());
        holder.textTittleShop.setText(currentItem.getTitle());
        holder.textInStock.setText(currentItem.getDescription());
        // Configura aquí los otros elementos del item
    }

    @Override
    public int getItemCount() {
        return ShopitemList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView ImageShop;
        public TextView textTittleShop;
        public TextView textInStock;
        // Agrega aquí referencias a los otros elementos

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageShop = itemView.findViewById(R.id.ImageShop);
            textTittleShop = itemView.findViewById(R.id.textTittleShop);
            textInStock = itemView.findViewById(R.id.textInStock);
            // Inicializa aquí los otros elementos
        }
    }
}
