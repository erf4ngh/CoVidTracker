package com.example.maps;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Loc{
    public Double lng;
    public Double lat;

    public Loc(){

    }

    public Loc(Double lng, Double lat){
        this.lng = lng;
        this.lat = lat;
    }
}