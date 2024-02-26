package com.example.practicafigma;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TabFragment4 extends Fragment {
    private RecyclerView recyclerViewTab4;
    private Tab4Adapter adapterTab4;
    private List<ItemTab4> itemListTab4;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab4, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        itemListTab4 = new ArrayList<>();

        itemListTab4.add(new ItemTab4("Cheesecake", "9.40", R.drawable.tartaqueso));
        itemListTab4.add(new ItemTab4("Crocantino", "$6,50", R.drawable.crocantino));
        itemListTab4.add(new ItemTab4("Dolce la nona", "$5,50", R.drawable.dolcelanona));
        itemListTab4.add(new ItemTab4("Strawberry ice", "$3,50", R.drawable.heladofresa));
        itemListTab4.add(new ItemTab4("Apple pie", "$5,50", R.drawable.tartaqueso2));
        itemListTab4.add(new ItemTab4("Flan", "$3,50", R.drawable.flan));
        itemListTab4.add(new ItemTab4("Yougur", "$2,50", R.drawable.yougurfresa));
        itemListTab4.add(new ItemTab4("Gelato colosale", "$5,50", R.drawable.gelatocolosale));

        recyclerViewTab4 = view.findViewById(R.id.recyclerViewTab4);
        recyclerViewTab4.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapterTab4 = new Tab4Adapter(itemListTab4, navController);
        recyclerViewTab4.setAdapter(adapterTab4);

        return view;
    }
}