package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.cexdirect.lib.Credentials;
import com.cexdirect.lib.Direct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Direct.INSTANCE.setCredentials(new Credentials("your_placement_id", "your_placement_secret"));
        Direct.INSTANCE.startDirect();
    }
}
