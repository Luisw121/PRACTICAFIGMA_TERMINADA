package com.example.practicafigma;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Tab1Adapter extends RecyclerView.Adapter<Tab1Adapter.Tab1ViewHolder> {
    private List<ItemTab1> itemList;
    private NavController navController;
    public Tab1Adapter(List<ItemTab1> itemList, NavController navController) {
        this.itemList = itemList;
        this.navController = navController;
    }

    @NonNull
    @Override
    public Tab1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tab1, parent, false);
        return new Tab1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tab1ViewHolder holder, int position) {

        ItemTab1 item = itemList.get(position);

        holder.titleTextView.setText(item.getTitle());
        holder.precioTextView.setText(item.getPrecio());
        holder.imageView.setImageResource(item.getImageResId());

        int heartColorTab1 = item.isFavourtiteTab1() ? Color.RED : Color.BLACK;


        holder.imageViewHeartTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setFavourtiteTab1(!item.isFavourtiteTab1());

                int newHeartColorTab1 = item.isFavourtiteTab1() ? Color.RED : Color.BLACK;
                holder.imageViewHeartTab1.setColorFilter(newHeartColorTab1);
            }
        });

            Button buttonAddCartTab1 = holder.buttonTAb1;

            buttonAddCartTab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navController.navigate(R.id.action_menuFragment_to_shoppingCartFragment);
                }
            });

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class Tab1ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView precioTextView;
        public Button buttonTAb1;
        ImageView imageView;
        public ImageView imageViewHeartTab1;

        public Tab1ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextViewTab1);
            precioTextView = itemView.findViewById(R.id.precioTab1); // Inicializar TextView para precio
            imageView = itemView.findViewById(R.id.imageViewTab1);
            buttonTAb1  = itemView.findViewById(R.id.buttonAddCartTab1);
            imageViewHeartTab1 = itemView.findViewById(R.id.imageViewHeartTab1);
        }
    }
}
