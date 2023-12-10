package com.example.gmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap gMap;
    protected <SupportMapFragment, googleMap> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.id_map);
        mapFragment.getMapAsync(this);


                public void onMapReady(@NonNull  GoogleMap googleMap)
        {
            LatLng location = new LatLng(20.5937,78.9629);
        GoogleMap googleMap;
        googleMap.addMarker(new MarkerOptions().position(location).title("india"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,12));


    }
}
}
