package com.example.practicafigma;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ActivityNavigatorDestinationBuilder;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private NavController navController;
    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener el NavController desde NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();

        // Configurar el listener para la BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setVisibility(View.GONE);
        navController.addOnDestinationChangedListener(((navController1, navDestination, bundle) -> {
            if (navDestination.getId() == R.id.menuFragment ||
                    navDestination.getId() == R.id.FavouriteFragment ||
                    navDestination.getId() == R.id.HistoryFragment ||
                    navDestination.getId() == R.id.ProfileFragment) {
                bottomNavigationView.setVisibility(View.VISIBLE);
            }else {
                bottomNavigationView.setVisibility(View.GONE);
            }
        }));
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Obtener el ID del elemento del menú seleccionado
                int itemId = item.getItemId();

                // Comparar el ID del elemento del menú seleccionado con los IDs específicos
                if (itemId == R.id.navigation_home) {
                    navController.navigate(R.id.menuFragment);
                    return true;
                } else if (itemId == R.id.navigation_favorite) {
                    navController.navigate(R.id.FavouriteFragment);
                    return true;
                } else if (itemId == R.id.navigation_history) {
                    navController.navigate(R.id.HistoryFragment);
                    return true;
                } else if (itemId == R.id.navigation_profile) {
                    navController.navigate(R.id.ProfileFragment);
                    return true;
                }
                return false;
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navigation_drawer);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Navegar hacia arriba cuando se presiona el botón de navegación de la AppBar
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        int currentDestinationId = navController.getCurrentDestination().getId();
        if (currentDestinationId == R.id.pantallaprincipalFragment) {
            super.onBackPressed();
        }else {
            navController.navigateUp();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Manejar la selección de elementos del menú
        if (item.getItemId() == R.id.menu) {
            // Navegar al destino correspondiente
            navController.navigate(R.id.menuFragment);
        } else if (item.getItemId() == R.id.favourite) {
            navController.navigate(R.id.FavouriteFragment);
        } else if (item.getItemId() == R.id.history) {
            navController.navigate(R.id.HistoryFragment);
        } else if (item.getItemId() == R.id.profile) {
            navController.navigate(R.id.ProfileFragment);
        } else if (item.getItemId() == R.id.logout) {
            navController.navigate(R.id.pantallaprincipalFragment);
            // Agregar aquí el código para el cierre de sesión
            Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show();
        }
        // Cerrar el drawer después de navegar a la nueva pestaña
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
/*
setSupportActionBar(findViewById(R.id.toolbar)); // Agrega la ActionBar

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navigation_drawer);

        // Establecer el listener para manejar las selecciones de los elementos del menú
        navigationView.setNavigationItemSelectedListener(this);

        // Obtener el NavController desde NavHostFragment
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        // Configurar la AppBarConfiguration con el NavController y el DrawerLayout
        mAppBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph())
                .setDrawerLayout(drawerLayout)
                .build();

        // Configurar la AppBar y la navegación con NavigationUI
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
 */