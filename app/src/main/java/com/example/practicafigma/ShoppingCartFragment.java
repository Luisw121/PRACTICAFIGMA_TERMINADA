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


public class ShoppingCartFragment extends Fragment {
    private NavController navController;
    private RecyclerView recyclerViewShop;
    private ItemShoppingAdapter adapterShop;
    private List<ItemShopping> itemListShop;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping_cart, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        itemListShop = new ArrayList<>();
        // Agrega elementos de ejemplo
        itemListShop.add(new ItemShopping(R.drawable.hamburgesa, "Cheese Burger Plux Max", "In Stock"));
        itemListShop.add(new ItemShopping(R.drawable.salad, "Veggie Salad Max Plus", "In Stock"));
        // Agrega más elementos según sea necesario

        recyclerViewShop = view.findViewById(R.id.recyclerViewShopping);
        recyclerViewShop.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapterShop = new ItemShoppingAdapter(itemListShop);
        recyclerViewShop.setAdapter(adapterShop);

        navController = Navigation.findNavController(view);

        Button butonprocescheck = view.findViewById(R.id.butonprocescheck);
        Button Buttontomenuprincipal = view.findViewById(R.id.Buttontomenuprincipal);

        Buttontomenuprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_shoppingCartFragment_to_menuFragment);
            }
        });
        butonprocescheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_shoppingCartFragment_to_paymentMethodFragment);
            }
        });
    }
}