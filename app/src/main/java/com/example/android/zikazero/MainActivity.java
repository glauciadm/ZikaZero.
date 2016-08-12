package com.example.android.zikazero;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_mosquito) {

            Intent intent = new Intent(this, MosquitoActivity.class); //chamar a activity
            startActivity(intent);

        } else if (id == R.id.nav_dengue) {

            Intent intent = new Intent(this, DengueActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_zika) {

            Intent intent = new Intent(this, ZikaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_chikun) {

            Intent intent = new Intent(this, ChikungunyaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_febreAmarela) {

            Intent intent = new Intent(this, FebreAmarelaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_prevencao) {

            Intent intent = new Intent(this, PrevencaoActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_denuncia) {

            Intent intent = new Intent(this, DenunciaActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_checklist) {

            Intent intent = new Intent(this, ChecklistActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_cuidese) {

            Intent intent = new Intent(this, CuideSeActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_sobre) {

            Intent intent = new Intent(this, SobreActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
