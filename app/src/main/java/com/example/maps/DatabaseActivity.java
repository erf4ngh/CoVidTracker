package com.example.maps;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.ValueEventListener;

public class DatabaseActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    //private DatabaseReference mDatabase;
    //mDatabase = FirebaseDatabase.getInstance().getReference();


    protected void onCreate(Bundle savedInstanceState) {
        myRef.setValue("Hello, World!");
    }

    private void addLoc(int rank, double nlng, double nlat){
        Loc loc = new Loc(nlng,nlat);
        myRef.child("locations").child("locations").setValue(loc);
    }

}
