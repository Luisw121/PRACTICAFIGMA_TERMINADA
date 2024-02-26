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

public class Tab4Adapter extends RecyclerView.Adapter<Tab4Adapter.Tab4ViewHolder> {
    private List<ItemTab4> itemTab4;
    private NavController navController;
    public Tab4Adapter(List<ItemTab4> itemTab4, NavController navController) {
        this.itemTab4 = itemTab4;
        this.navController = navController;
    }

    @NonNull
    @Override
    public Tab4ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tab4, parent, false);
        return new Tab4ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tab4Adapter.Tab4ViewHolder holder, int position) {
        ItemTab4 item4 = itemTab4.get(position);

        holder.titleTextView4.setText(item4.getTitleTab4());
        holder.precioTextView4.setText(item4.getPrecioTab4());
        holder.imageView4.setImageResource(item4.getImageResIdTab4());

        int heartColorTab4 = item4.isFavourtiteTab4() ? Color.RED : Color.BLACK;

        holder.imageViewHeartTab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item4.setFavourtiteTab4(!item4.isFavourtiteTab4());

                int newHeartColorTab4 = item4.isFavourtiteTab4() ? Color.RED : Color.BLACK;
                holder.imageViewHeartTab4.setColorFilter(newHeartColorTab4);
            }
        });
        Button buttonAddCartTab4 = holder.buttonTAb4;

        buttonAddCartTab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_menuFragment_to_shoppingCartFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemTab4.size();
    }

    public static class Tab4ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView4;
        TextView precioTextView4;
        public Button buttonTAb4;
        ImageView imageView4;
        public ImageView imageViewHeartTab4;

        public Tab4ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView4 = itemView.findViewById(R.id.titleTextViewTab4);
            precioTextView4 = itemView.findViewById(R.id.precioTab4);
            imageView4 = itemView.findViewById(R.id.imageViewTab4);
            buttonTAb4  = itemView.findViewById(R.id.buttonAddCartTab4);
            imageViewHeartTab4 = itemView.findViewById(R.id.imageViewHeartTab4);
        }
    }
}

