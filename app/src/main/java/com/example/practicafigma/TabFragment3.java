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

public class TabFragment3 extends Fragment {
    private RecyclerView recyclerViewTab3;
    private Tab3Adapter adapterTab3;
    private List<ItemTab3> itemListTab3;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        itemListTab3 = new ArrayList<>();

        itemListTab3.add(new ItemTab3("Sicy potatoes", "$6,50", R.drawable.patatasbravas));
        itemListTab3.add(new ItemTab3("Chicken wings", "$5,50", R.drawable.pollorebozado));
        itemListTab3.add(new ItemTab3("Combo XL", "$8,50", R.drawable.comboxl));
        itemListTab3.add(new ItemTab3("Potatoes with kitchen", "$4,50", R.drawable.potatoswithchicken));
        itemListTab3.add(new ItemTab3("Tacos mexican", "$8", R.drawable.tacosmexican));
        itemListTab3.add(new ItemTab3("Combo seafood", "$6", R.drawable.comboseafod));
        itemListTab3.add(new ItemTab3("Combo seafood XL", "$7,50", R.drawable.comboseafodxl));
        itemListTab3.add(new ItemTab3("Only kitchen", "$8,50", R.drawable.onlykitchen));

        recyclerViewTab3 = view.findViewById(R.id.recyclerViewTab3);
        recyclerViewTab3.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapterTab3 = new Tab3Adapter(itemListTab3, navController);
        recyclerViewTab3.setAdapter(adapterTab3);

        return view;
    }
}
