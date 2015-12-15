package com.example.siti.homework2;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;


public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        List<Address> AdresList = null;
        String location = SecondScreenActyvity.Adres.getText().toString() + " " +
                SecondScreenActyvity.City.getText().toString();
        Geocoder geocod = new Geocoder(this);

    }


}
