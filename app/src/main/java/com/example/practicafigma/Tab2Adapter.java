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

public class Tab2Adapter extends RecyclerView.Adapter<Tab2Adapter.Tab2ViewHolder> {
    private List<ItemTab2> itemTab2;
    private NavController navController;

    public Tab2Adapter(List<ItemTab2> itemTab2, NavController navController) {
        this.itemTab2 = itemTab2;
        this.navController = navController;
    }

    @NonNull
    @Override
    public Tab2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tab2, parent, false);
        return new Tab2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tab2Adapter.Tab2ViewHolder holder, int position) {
        ItemTab2 item2 = itemTab2.get(position);

        holder.titleTextView2.setText(item2.getTitleTab2());
        holder.precioTextView2.setText(item2.getPrecioTab2());
        holder.imageView2.setImageResource(item2.getImageResIdTab2());

        int heartColorTab2 = item2.isFavourtiteTab2() ? Color.RED : Color.BLACK;

        holder.imageViewHeartTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item2.setFavourtiteTab2(!item2.isFavourtiteTab2());

                int newHeartColorTab2 = item2.isFavourtiteTab2() ? Color.RED : Color.BLACK;
                holder.imageViewHeartTab2.setColorFilter(newHeartColorTab2);
            }
        });
        Button buttonAddCartTab2 = holder.buttonTAb2;
        buttonAddCartTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_menuFragment_to_shoppingCartFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemTab2.size();
    }

    public static class Tab2ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView2;
        TextView precioTextView2;
        public Button buttonTAb2;
        ImageView imageView2;
        public ImageView imageViewHeartTab2;

        public Tab2ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView2 = itemView.findViewById(R.id.titleTextViewTab2);
            precioTextView2 = itemView.findViewById(R.id.precioTab2); // Inicializar TextView para precio
            imageView2 = itemView.findViewById(R.id.imageViewTab2);
            buttonTAb2  = itemView.findViewById(R.id.buttonAddCartTab2);
            imageViewHeartTab2 = itemView.findViewById(R.id.imageViewHeartTab2);
        }
    }
}
