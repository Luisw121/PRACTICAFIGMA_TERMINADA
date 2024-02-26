package com.example.practicafigma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    private RecyclerView recyclerView;
    private HistoryAdapter adapter;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        // Crear una lista de HistoryItem con datos de ejemplo
        List<HistoryItem> historyItemList = new ArrayList<>();
        historyItemList.add(new HistoryItem(R.drawable.crocantino, "The order was placed succesfully", "27/1/2019"));
        historyItemList.add(new HistoryItem(R.drawable.hamburgesa, "The order was placed succesfully", "22/2/1019"));
        historyItemList.add(new HistoryItem(R.drawable.tartaqueso2, "The order was placed succesfully", "01/1/2020"));
        historyItemList.add(new HistoryItem(R.drawable.patatasbravas, "The order was placed succesfully", "11/12/2020"));
        historyItemList.add(new HistoryItem(R.drawable.cocacola, "The order was placed succesfully", "17/12/2021"));
        historyItemList.add(new HistoryItem(R.drawable.salad, "The order was placed succesfully", "07/12/2021"));
        historyItemList.add(new HistoryItem(R.drawable.cocacolazero, "The order was placed succesfully", "07/2/2023"));
        historyItemList.add(new HistoryItem(R.drawable.pollorebozado, "The order was placed succesfully", "08/04/2023"));

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Crear y establecer el adaptador con la lista de HistoryItem
        adapter = new HistoryAdapter(historyItemList, navController);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
