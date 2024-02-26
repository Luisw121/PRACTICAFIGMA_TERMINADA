package com.example.practicafigma;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class drawer_menu extends Fragment {

    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drawer_menu, container, false);
    }
}
/*
@Override
    public void onViewCreated(@NonNull View view,@Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        TextView buttonFood = view.findViewById(R.id.buttonFood);
        TextView buttonDrinks = view.findViewById(R.id.buttonDrinks);
        TextView buttonSnacks = view.findViewById(R.id.buttonSnacks);
        TextView buttonDeserts = view.findViewById(R.id.buttonDeserts);
        TextView buttonShoppingCart = view.findViewById(R.id.buttonShoppingCart);
        TextView buttonHelp = view.findViewById(R.id.buttonHelp);
        Button buttonouttoprincipal = view.findViewById(R.id.buttonouttoprincipal);

        buttonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Button Food clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_tabFragment2);
            }
        });
        buttonSnacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_tabFragment3);
            }
        });
        buttonDeserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_tabFragment4);
            }
        });
        buttonShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_shoppingCartFragment);
            }
        });
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_customerSuportFragment);
            }
        });
        buttonouttoprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_drawer_menu_to_loginFragment);
            }
        });

    }
 */