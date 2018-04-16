package com.example.muradahmad.locationbasedservices;

import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by muradahmad on 20/02/2018.
 */

public class LocationModel {
    String latitude;
    String longitude;
    String message;
    public LocationModel(String latitude, String longitude, String message) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.message = message;
    }


}
