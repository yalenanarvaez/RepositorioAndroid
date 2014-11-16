package com.example.reminderme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;


public class MainActivity extends ActionBarActivity {
	 private GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        try {
            // Loading map
            initilizeMap();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initilizeMap() {
		// TODO Auto-generated method stub
    	if (googleMap == null) {
    		Fragment fragment=getSupportFragmentManager().findFragmentById(R.id.map);
    		SupportMapFragment mapFragment= (SupportMapFragment) fragment;
    		googleMap = mapFragment.getMap();
            //googleMap =  get).findFragmentById(R.id.map)).get
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
                
                
                
                
                
            }
        }
    	
	}

	protected void pruebaYale(){
    	   
   
    }
    
}
