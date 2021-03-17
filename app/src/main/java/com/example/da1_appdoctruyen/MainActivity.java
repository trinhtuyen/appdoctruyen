package com.example.da1_appdoctruyen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.da1_appdoctruyen.Screen.HomeFragment;
import com.example.da1_appdoctruyen.Screen.LichSuFragment;
import com.example.da1_appdoctruyen.Screen.MoreFragment;
import com.example.da1_appdoctruyen.Screen.ThuVienFragment;
import com.example.da1_appdoctruyen.Screen.YeuThichFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFrag = null;
            switch (item.getItemId()){
                case R.id.nav_home:
                    selectedFrag  = new HomeFragment();
                    break;
                case R.id.nav_library:
                    selectedFrag  = new ThuVienFragment();
                    break;
                case R.id.nav_history:
                    selectedFrag  = new LichSuFragment();
                    break;
                case R.id.nav_favorite:
                    selectedFrag  = new YeuThichFragment();
                    break;
                case R.id.nav_more:
                    selectedFrag  = new MoreFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedFrag).commit();
            return true ;

        }
    };

}