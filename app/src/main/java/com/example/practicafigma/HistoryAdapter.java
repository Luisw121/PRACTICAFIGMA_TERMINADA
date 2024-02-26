package com.example.practicafigma;

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

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {

    private List<HistoryItem> historyItemList;
    private NavController navController;

    public HistoryAdapter(List<HistoryItem> historyItemList, NavController navController) {
        this.historyItemList = historyItemList;
        this.navController = navController;
    }

    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history, parent, false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {
        HistoryItem historyItem = historyItemList.get(position);
        holder.imageView.setImageResource(historyItem.getImageRes());
        holder.textViewDescription.setText(historyItem.getDescription());
        holder.textViewTitle.setText(historyItem.getTitle());
        Button buttonrepeatorden = holder.buttonrepeatorden;

        buttonrepeatorden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_historyFragment_to_menuFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return historyItemList.size();
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewTitle;
        private TextView textViewDescription;
        private Button buttonrepeatorden;

        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            buttonrepeatorden = itemView.findViewById(R.id.buttonrepeatorden);
        }

        public void bind(HistoryItem historyItem) {
            // Aquí estableces los datos para cada elemento del RecyclerView
            imageView.setImageResource(historyItem.getImageRes());
            textViewTitle.setText(historyItem.getTitle());
            textViewDescription.setText(historyItem.getDescription());
        }
    }
}