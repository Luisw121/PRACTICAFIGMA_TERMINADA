package com.example.practicafigma;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import java.util.List;

public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteAdapter.FavouriteViewHolder> {

    private List<FavouriteItem> favouriteItems;
    private NavController navController;

    public FavouriteAdapter(List<FavouriteItem> favouriteItems, NavController navController) {
        this.favouriteItems = favouriteItems;
        this.navController = navController;
    }

    @NonNull
    @Override
    public FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favourite, parent, false);
        return new FavouriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteViewHolder holder, int position) {
        FavouriteItem favouriteItem = favouriteItems.get(position);

        holder.imageView.setImageResource(favouriteItem.getImageResource());
        holder.textViewTitle.setText(favouriteItem.getTitle());
        holder.precioFAV.setText(favouriteItem.getPrice());

        int heartColor = favouriteItem.isFavourite() ? Color.RED : Color.BLACK;

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementa la lógica del botón aquí
            }
        });

        holder.imageViewHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el estado de isFavourite
                favouriteItem.setFavourite(!favouriteItem.isFavourite());

                // Actualizar el color del corazón según el nuevo estado
                int newHeartColor = favouriteItem.isFavourite() ? Color.RED : Color.BLACK;
                holder.imageViewHeart.setColorFilter(newHeartColor);
            }
        });
        Button textViewDescriptionFAV = holder.button;

        textViewDescriptionFAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_FavouriteFragment_to_shoppingCartFragment);
            }
        });
    }


    @Override
    public int getItemCount() {
        // Devuelve la cantidad de elementos en tu lista
        return favouriteItems.size();
    }

    public static class FavouriteViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textViewTitle;

        public Button button;
        public TextView precioFAV;
        public ImageView imageViewHeart;

        public FavouriteViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewFAV);
            textViewTitle = itemView.findViewById(R.id.textViewTitleFAV);
            button = itemView.findViewById(R.id.textViewDescriptionFAV);
            precioFAV = itemView.findViewById(R.id.precioFAV);
            imageViewHeart = itemView.findViewById(R.id.imageViewHeart);

        }
    }
}
