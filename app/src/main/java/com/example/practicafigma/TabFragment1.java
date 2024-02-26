package com.example.practicafigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class TabFragment1 extends Fragment {
    private NavController navController;
    private RecyclerView recyclerViewTab1;
    private Tab1Adapter adapterTab1;
    private List<ItemTab1> itemListTab1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        itemListTab1 = new ArrayList<>();

        // Agrega elementos de muestra
        itemListTab1.add(new ItemTab1("Cheese Burger Plux", "$8,50", R.drawable.hamburgesa));
        itemListTab1.add(new ItemTab1("Veggie Salad Max", "$8.50", R.drawable.salad));
        itemListTab1.add(new ItemTab1("Beacon Burger Plux", "$9,50", R.drawable.hamburgesa2));
        itemListTab1.add(new ItemTab1("Spaghetti Bolognesa", "$10", R.drawable.espaguestibol));
        itemListTab1.add(new ItemTab1("Rice with beans", "$10,50", R.drawable.arroz));
        itemListTab1.add(new ItemTab1("Spaghetti Carbonara", "$10", R.drawable.espaguetticarbo));
        itemListTab1.add(new ItemTab1("Pizza procuitto", "$12,50", R.drawable.pizzaprocuito));
        itemListTab1.add(new ItemTab1("Pizza bacon", "$12,50", R.drawable.pizzabaicon));

        recyclerViewTab1 = view.findViewById(R.id.recyclerViewFragmentTab1);
        recyclerViewTab1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapterTab1 = new Tab1Adapter(itemListTab1, navController);
        recyclerViewTab1.setAdapter(adapterTab1);

        return view;
    }

}
