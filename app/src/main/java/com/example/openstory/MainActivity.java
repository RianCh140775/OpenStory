package com.example.openstory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    ExploreFragment exploreFragment = new ExploreFragment();
    AddFragment addFragment = new AddFragment();
    PersonFragment personFragment = new PersonFragment();
    OtherFragment otherFragment = new OtherFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.explore:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,exploreFragment).commit();
                        return true;
                    case R.id.add:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,addFragment).commit();
                        return true;
                    case R.id.person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,personFragment).commit();
                        return true;
                    case R.id.other:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,otherFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}