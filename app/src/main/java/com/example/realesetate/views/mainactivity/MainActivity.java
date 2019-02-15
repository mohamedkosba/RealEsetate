package com.example.realesetate.views.mainactivity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.realesetate.R;
import com.example.realesetate.views.mainactivity.addfragment.AddFragment;
import com.example.realesetate.views.mainactivity.favoritefragment.FavoriteFragment;
import com.example.realesetate.views.mainactivity.profilefragment.ProfileFragment;
import com.example.realesetate.views.mainactivity.searchfragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private FrameLayout mFrameLayout;

    private SearchFragment mSearchFragment;
    private FavoriteFragment mFavoriteFragment;
    private AddFragment mAddFragment;
    private ProfileFragment mProfileFragment;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigationView = findViewById(R.id.main_nav);
        mFrameLayout = findViewById(R.id.main_frame);

        // create the constructor for the fragments
        mSearchFragment = new SearchFragment();
        mFavoriteFragment = new FavoriteFragment();
        mAddFragment = new AddFragment();
        mProfileFragment = new ProfileFragment();

        // set this fragment as a default fragment
        setFragment(mSearchFragment);


        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            // this will return an Item which will be one of the buttons we have created
            // early i the BuutonNavigationView

            // WRITE THE CODE THAT U want to execute here in the switch cases
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.navigation_search:
                        mBottomNavigationView.setItemBackgroundResource(R.color.red);
                        // here when we press on button it will change the fragment attach to it
                        setFragment(mSearchFragment);
                        return true;

                    case R.id.navigation_favorite:
                        mBottomNavigationView.setItemBackgroundResource(R.color.blue);
                        setFragment(mFavoriteFragment);
                        return true;

                    case R.id.navigation_add:
                        mBottomNavigationView.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(mAddFragment);
                        return true;

                    case R.id.navigation_profile:
                        mBottomNavigationView.setItemBackgroundResource(R.color.yellow);
                        setFragment(mProfileFragment);
                        return true;

                    default:
                        return false;
                }

            }
        });


    }

    private void setFragment(Fragment fragment) {
        // here we will use the fragment transaction to change the fragment in the layout
        FragmentTransaction mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        // here we attach the the layout with the proper fragment
        mFragmentTransaction.replace(R.id.main_frame, fragment);
        // commit = execute
        mFragmentTransaction.commit();
    }

}
