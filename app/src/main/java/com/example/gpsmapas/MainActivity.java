package com.example.gpsmapas;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener,GoogleMap.OnMapLongClickListener {

    EditText txtlatitud, txtLongitud;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtlatitud=findViewById(R.id.txt_latitud);
        txtLongitud=findViewById(R.id.txt_longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

        VideoView miVideito = findViewById(R.id.videoView);
        String videito = "android.resource://"+getPackageName()+"/"+R.raw.sttomas;
        Uri uri = Uri.parse(videito);
        miVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        miVideito.setMediaController(mediaController);
        mediaController.setAnchorView(miVideito);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Arica = new LatLng(-18.48331014257585, -70.3103862471693);
        mMap.addMarker(new MarkerOptions().position(Arica).title("Santo Tomas Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));

        LatLng Iquique = new LatLng(-20.23637463146407, -70.14419628126129);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Santo Tomas Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));

        LatLng Antofagasta = new LatLng(-23.370822771338634, -70.35727892173578);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Santo Tomas Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));

        LatLng Serena = new LatLng(-29.624023315333886, -71.37315274254279);
        mMap.addMarker(new MarkerOptions().position(Serena).title("Santo Tomas La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Serena));

        LatLng Delmar = new LatLng(-32.851691288162264, -71.51545336775791);
        mMap.addMarker(new MarkerOptions().position(Delmar).title("Santo Tomas Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Delmar));

        LatLng Santiasco = new LatLng(-33.44421981863682, -70.66112756781901);
        mMap.addMarker(new MarkerOptions().position(Santiasco).title("Santo Tomas Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiasco));

        LatLng Talca = new LatLng(-35.4232253563869, -71.67429194567974);
        mMap.addMarker(new MarkerOptions().position(Talca).title("Santo Tomas Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));

        LatLng Concepcion = new LatLng(-36.826230299830165, -73.06162838021847);
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("Santo Tomas Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));

        LatLng Angeles = new LatLng(-37.44434537664145, -72.35643355254467);
        mMap.addMarker(new MarkerOptions().position(Angeles).title("Santo Tomas Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Angeles));

        LatLng Temuco = new LatLng(-38.733993136051346, -72.60208762320417);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Santo Tomas Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng Valdivia = new LatLng(-39.80119853171302, -73.25372849156778);
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("Santo Tomas Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));

        LatLng Osorno = new LatLng(-40.56902322610475, -73.14012185869082);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Santo Tomas Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));

        LatLng Puerto = new LatLng(-41.452261736034615, -72.93584567604987);
        mMap.addMarker(new MarkerOptions().position(Puerto).title("Santo Tomas Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Puerto));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtlatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtlatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }
}