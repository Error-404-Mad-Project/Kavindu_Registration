package com.example.shopforme;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class CustomerView extends AppCompatActivity {
    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_customer_view);
    }
        /** mDrawerlayout = (DrawerLayout) findViewById (R.id.navigation);
        mToggle = new ActionBarDrawerToggle (this, mDrawerlayout, R.string.open, R.string.close);
        mDrawerlayout.addDrawerListener (mToggle);
        mToggle.syncState ();
        getSupportActionBar ().setDisplayHomeAsUpEnabled (true);



    @Override
    public boolean onOptionItemSelected(MenuItem item) {
        return super.onOptionsItemSelected (item);
    } **/
}
