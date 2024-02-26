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


public class TabFragment2 extends Fragment {
    private RecyclerView recyclerViewTab2;
    private Tab2Adapter adapterTab2;
    private NavController navController;
    private List<ItemTab2> itemListTab2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        itemListTab2 = new ArrayList<>();

        itemListTab2.add(new ItemTab2("Pepsi 35cl", "$2,50", R.drawable.pepsinormal));
        itemListTab2.add(new ItemTab2("Pepsi Max 35cl", "$2,50", R.drawable.pepsizero));
        itemListTab2.add(new ItemTab2("Aquarius limon 35cl", "$2,50", R.drawable.aquariuslimon));
        itemListTab2.add(new ItemTab2("Aquarius naranja 35cl", "$2,50", R.drawable.aquariusnaranja));
        itemListTab2.add(new ItemTab2("Lipton 35cl", "$2,50", R.drawable.lipton));
        itemListTab2.add(new ItemTab2("Nestea 35cl", "$2,50", R.drawable.nestea));
        itemListTab2.add(new ItemTab2("Cocacola 35cl", "$2,50", R.drawable.cocacola35cl));
        itemListTab2.add(new ItemTab2("Cocacola zero", "$2,50", R.drawable.cocacola35clzero));

        recyclerViewTab2 = view.findViewById(R.id.recyclerViewTab2);
        recyclerViewTab2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapterTab2 = new Tab2Adapter(itemListTab2, navController);
        recyclerViewTab2.setAdapter(adapterTab2);

        return view;
    }
}
