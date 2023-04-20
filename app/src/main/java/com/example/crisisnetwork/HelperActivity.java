package com.example.crisisnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HelperActivity extends AppCompatActivity {
    VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);
        //vv is the id of videoview
        vv = findViewById(R.id.vv);
        vv.setVideoPath("android.resource://com.example.crisisnetwork/" + R.raw.chicago2);

        //This is for getting the play, pause, stop buttons.
        MediaController med = new MediaController(this);
        vv.setMediaController(med);
        med.setAnchorView(vv);
        vv.start();
    }
}