package com.example.asheransari.firebasestarting;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by asher.ansari on 3/24/2017.
 */

public class FirebaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    }
}
