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

public class registerEntrepreneurFragment extends Fragment {

    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register_entrepreneur, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        Button LoginButtonEnrepreneur2 = view.findViewById(R.id.LoginButtonEnrepreneur2);
        Button SingUpButtonEntrepreneur2 = view.findViewById(R.id.SingUpButtonEntrepreneur2);
        Button CreateAccountEntrepreneur2 = view.findViewById(R.id.CreateAccountEntrepreneur2);

        LoginButtonEnrepreneur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_registerEntrepreneurFragment_to_loginEntrepreneurFragment);
            }
        });
        CreateAccountEntrepreneur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_registerEntrepreneurFragment_to_menuFragment);
            }
        });
    }
}