package com.example.practicafigma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FavouriteFragment extends Fragment {

    private RecyclerView recyclerViewFav;
    private FavouriteAdapter adapter;
    private List<FavouriteItem> favouriteItemList;
    private NavController navController;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        // Inicializar la lista de elementos favoritos
        favouriteItemList = new ArrayList<>();
        // Añadir elementos favoritos de ejemplo
        favouriteItemList.add(new FavouriteItem(R.drawable.crocantino, "Crocantino", "6,25"));
        favouriteItemList.add(new FavouriteItem(R.drawable.patatasbravas, "Spicy potatoes", "6,25"));
        favouriteItemList.add(new FavouriteItem(R.drawable.tartaqueso2, "Cheesecake", "6,25"));
        favouriteItemList.add(new FavouriteItem(R.drawable.hamburgesa, "Cheese Burger Plus", "6,25"));
        favouriteItemList.add(new FavouriteItem(R.drawable.cocacolazero, "Pepsi Maz 35cl", "6,25"));


        // Configurar el RecyclerView
        recyclerViewFav = view.findViewById(R.id.recyclerViewFavourites);
        recyclerViewFav.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapter = new FavouriteAdapter(favouriteItemList, navController);
        recyclerViewFav.setAdapter(adapter);



        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        Button carritocompra = view.findViewById(R.id.carritocompra);

        carritocompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_FavouriteFragment_to_shoppingCartFragment);
            }
        });
    }
}

