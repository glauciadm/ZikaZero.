package com.example.android.zikazero;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }





    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);

        LatLng studyJams = new LatLng(-19.9201,-43.9207 );

        MarkerOptions marker = new MarkerOptions();
        marker.position(studyJams);
        marker.title("Study Jams GDG");
        marker.snippet("");

        //Cria o marcador padrão com um tom de cor vermelha.
        BitmapDescriptor cor = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED);
        marker.icon(cor);

        //Adicionando um marcador
        mMap.addMarker(marker);

        //Movimenta a camera Zoom no mapa
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(studyJams, 17.0f);
        mMap.moveCamera(cameraUpdate);

        //mMap.addMarker(new MarkerOptions().position(googlebh).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(googlebh));
    }


    /**
     * Adicionar Marcador no Mapa
     */
    public void adicionarMarcador(String nome, String descricao, LatLng posicao, float cor) {

        //Criando marcador
        MarkerOptions marker = new MarkerOptions();
        marker.position(posicao); //Seta a posição do marcador
        marker.title(nome); //Seta o título do marcador
        marker.snippet(descricao); //Seta uma breve descrição sobre o marcador

        //Cria o marcador padrão com um tom de cor vermelho.
        BitmapDescriptor icone = BitmapDescriptorFactory.defaultMarker(cor);
        marker.icon(icone);

        //Adicionando um marcador
        mMap.addMarker(marker);
    }
}
