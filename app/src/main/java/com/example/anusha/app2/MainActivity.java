package com.example.anusha.app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff);


        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();




                mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        mDrawerLayout.closeDrawers();



                        if (menuItem.getItemId() == R.id.home) {
                            Intent menuIntent = new Intent(MainActivity.this,MainActivity.class);
                            startActivity(menuIntent);

                        }

                      else  if (menuItem.getItemId() == R.id.skills) {
                            Intent menuIntent = new Intent(MainActivity.this,Skillset.class);
                            startActivity(menuIntent);

                        }
                        else  if (menuItem.getItemId() == R.id.achieve) {
                            Intent menuIntent = new Intent(MainActivity.this,Achievements.class);
                            startActivity(menuIntent);

                        }
                        else  if (menuItem.getItemId() == R.id.android) {
                            Intent menuIntent = new Intent(MainActivity.this,Why_Android.class);
                            startActivity(menuIntent);


                        }
                        else  if (menuItem.getItemId() == R.id.Experi) {
                            Intent menuIntent = new Intent(MainActivity.this,Experience.class);
                            startActivity(menuIntent);


                        }
                        else  if (menuItem.getItemId() == R.id.project) {
                            Intent menuIntent = new Intent(MainActivity.this,DreamProj.class);
                            startActivity(menuIntent);


                        }

                        return false;
                    }

                });




        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name,
                R.string.app_name);

        mDrawerLayout.addDrawerListener(mDrawerToggle);


        mDrawerToggle.syncState();

    }



}
