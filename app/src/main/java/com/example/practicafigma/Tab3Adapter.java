package com.example.practicafigma;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Tab3Adapter extends RecyclerView.Adapter<Tab3Adapter.Tab3ViewHolder> {
    private List<ItemTab3> itemTab3;
    private NavController navController;
    public Tab3Adapter(List<ItemTab3> itemTab3, NavController navController) {
        this.itemTab3 = itemTab3;
        this.navController = navController;
    }

    @NonNull
    @Override
    public Tab3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tab3, parent, false);
        return new Tab3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tab3Adapter.Tab3ViewHolder holder, int position) {
        ItemTab3 item3 = itemTab3.get(position);

        holder.titleTextView3.setText(item3.getTitleTab3());
        holder.precioTextView3.setText(item3.getPrecioTab3());
        holder.imageView3.setImageResource(item3.getImageResIdTab3());

        int heartColorTab3 = item3.isFavourtiteTab3() ? Color.RED : Color.BLACK;

        holder.imageViewHeartTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item3.setFavourtiteTab3(!item3.isFavourtiteTab3());

                int newHeartColorTab3 = item3.isFavourtiteTab3() ? Color.RED : Color.BLACK;
                holder.imageViewHeartTab3.setColorFilter(newHeartColorTab3);
            }
        });
        Button buttonAddCartTab3 = holder.buttonTAb3;
        buttonAddCartTab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_menuFragment_to_shoppingCartFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemTab3.size();
    }

    public static class Tab3ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView3;
        TextView precioTextView3;
        public Button buttonTAb3;
        ImageView imageView3;
        public ImageView imageViewHeartTab3;

        public Tab3ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView3 = itemView.findViewById(R.id.titleTextViewTab3);
            precioTextView3 = itemView.findViewById(R.id.precioTab3);
            imageView3 = itemView.findViewById(R.id.imageViewTab3);
            buttonTAb3  = itemView.findViewById(R.id.buttonAddCartTab3);
            imageViewHeartTab3 = itemView.findViewById(R.id.imageViewHeartTab3);
        }
    }
}
