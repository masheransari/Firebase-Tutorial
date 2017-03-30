package com.example.asheransari.firebasestarting;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by asher.ansari on 3/30/2017.
 */

public class FireApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
