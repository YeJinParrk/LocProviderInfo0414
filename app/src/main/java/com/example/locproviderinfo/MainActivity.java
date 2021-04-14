package com.example.locproviderinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txtInfo;
    LocationManager locManager;
    List<String> locProvidersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo = (TextView)findViewById(R.id.txtInfo);
        locManager = (LocationManager)getSystemService(LOCATION_SERVICE);

        locProvidersList = locManager.getAllProviders();
        txtInfo.setText("");

        for(String locProvName : locProvidersList){
            txtInfo.append("Loc.Provider :" + locProvName + "\n");
            txtInfo.append("Enabled :" + locManager.isProviderEnabled(locProvName) + "\n\n");

        }
    }
}