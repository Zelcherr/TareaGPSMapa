package com.example.tareagpsmapa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class sedes extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener,GoogleMap.OnMapLongClickListener{

    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        txtLatitud = findViewById(R.id.txt_Latitud);
        txtLongitud = findViewById(R.id.txt_Longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        //Arica
        LatLng Arica = new LatLng(-18.483367634243876,-70.31035657972097);
        mMap.addMarker(new MarkerOptions().position(Arica).title("Universidad Santo Tomás Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));
        //Iquique
        LatLng Iquique = new LatLng(-20.239769626319667,-70.14487702399492);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Universidad Santo Tomás Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));
        //Antofagasta
        LatLng Antofagasta = new LatLng(-23.634841, -70.394137);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Universidad Santo Tomás Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));
        // La Serena
        LatLng  LaSerena = new LatLng(-29.908744990590368, -71.2572355576555);
        mMap.addMarker(new MarkerOptions().position( LaSerena).title("Universidad Santo Tomás La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( LaSerena));
        // Viña del Mar
        LatLng ViñadelMar = new LatLng(-33.03758922198383, -71.52211840257151);
        mMap.addMarker(new MarkerOptions().position(ViñadelMar).title("Universidad Santo Tomás Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ViñadelMar));
        // Viña del Mar OTRA SEDE
        LatLng ViñadelMar2 = new LatLng(-33.03652102466548, -71.5171760577291);
        mMap.addMarker(new MarkerOptions().position(ViñadelMar2).title("UST Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ViñadelMar2));
        // Santiago
        LatLng Santiago = new LatLng(-33.448861772145165, -70.66093303628786);
        mMap.addMarker(new MarkerOptions().position(Santiago).title("Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));
        // Talca
        LatLng Talca = new LatLng(-35.428754548673766, -71.67291073588117);
        mMap.addMarker(new MarkerOptions().position(Talca).title("Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));
        // Concepción
        LatLng Concepción = new LatLng(-36.82639077701573, -73.06171398754293);
        mMap.addMarker(new MarkerOptions().position(Concepción).title("Concepción"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepción));
        //  Los Angeles
        LatLng  LosAngeles = new LatLng(-37.473259161471674, -72.35454858046084);
        mMap.addMarker(new MarkerOptions().position(LosAngeles).title(" Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LosAngeles));
        // Temuco
        LatLng Temuco = new LatLng(-38.73173630893477, -72.60364509188099);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));
        // Valdivia
        LatLng  Valdivia = new LatLng(-39.81737990956216, -73.23314057204249);
        mMap.addMarker(new MarkerOptions().position( Valdivia).title(" Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Valdivia));
        //Osorno
        LatLng Osorno = new LatLng(-40.57196292230071, -73.1377233870075);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));
        //Puerto Montt
        LatLng PuertoMontt = new LatLng(-41.47276293338435, -72.92889564688335);
        mMap.addMarker(new MarkerOptions().position(PuertoMontt).title("Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PuertoMontt));
        // Temuco
        LatLng Temuco1 = new LatLng(-38.734581845133796, -72.60202961905831);
        mMap.addMarker(new MarkerOptions().position(Temuco1).title("Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco1));
    }
    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
    public void Back(View view){
        Intent Back = new Intent(this, MainActivity.class);
        startActivity(Back);
    }
}