package id.sch.smktelkom_mlg.location_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap m_map;
    boolean mapReady = false;

    MarkerOptions Blitar;

    MarkerOptions Malang;

    MarkerOptions Surabaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Blitar = new MarkerOptions()
                .position(new LatLng(-8.085849, 112.05956))
                .title("Srengat");

        Malang = new MarkerOptions()
                .position(new LatLng(-7.966620, 112.632632))
                .title("Malang");

        Surabaya = new MarkerOptions()
                .position(new LatLng(-7.257472, 112.752088))
                .title("Malang");
    }


    @Override
    public void onMapReady(GoogleMap map) {
       
    }
}
