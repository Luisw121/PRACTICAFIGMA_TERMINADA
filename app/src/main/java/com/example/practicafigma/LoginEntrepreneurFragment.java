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

public class LoginEntrepreneurFragment extends Fragment {
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_entrepreneur, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        Button SingUpButtonCompany = view.findViewById(R.id.SingUpButtonCompany);
        Button LoginButtoCompany = view.findViewById(R.id.LoginButtoCompany);
        TextView ForgotPasswordButton_company = view.findViewById(R.id.ForgotPasswordButton_company);

        ForgotPasswordButton_company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginEntrepreneurFragment_to_forgotpasswordFragment);
            }
        });
        LoginButtoCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginEntrepreneurFragment_to_menuFragment);
            }
        });
        SingUpButtonCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginEntrepreneurFragment_to_registerEntrepreneurFragment);
            }
        });
    }
}