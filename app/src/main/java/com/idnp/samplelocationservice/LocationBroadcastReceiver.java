package com.idnp.samplelocationservice;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.widget.Toast;


public class LocationBroadcastReceiver extends BroadcastReceiver {
    private String TAG = "LocationBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive");

        if (intent.hasExtra(LocationManager.KEY_LOCATION_CHANGED)) {

            String locationKey = LocationManager.KEY_LOCATION_CHANGED;
            Location location = (Location) intent.getExtras().get(locationKey);
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();

            Log.d(TAG,  latitude+","+longitude);
            Toast.makeText(context, latitude+","+longitude, Toast.LENGTH_LONG).show();

        }
    }
}