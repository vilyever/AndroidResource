package com.vilyever.androidresource;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.vilyever.resource.Resource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, Resource.getString(R.string.app_name), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.d("getString", "presetAbout getString " + Resource.getString(R.string.presetAbout));
        Log.d("getString", "presetAbout getStringEnglish " + Resource.getStringEnglish(R.string.presetAbout));
        Log.d("getString", "presetAbout getStringChinese " + Resource.getStringChinese(R.string.presetAbout));
        Log.d("getString", "app_name getString " + Resource.getString(R.string.app_name));
        Log.d("getString", "app_name getStringEnglish " + Resource.getStringEnglish(R.string.app_name));
        Log.d("getString", "app_name getStringChinese " + Resource.getStringChinese(R.string.app_name));
    }

}
