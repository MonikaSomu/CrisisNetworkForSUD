package com.example.crisisnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HelperActivity extends AppCompatActivity {
    VideoView vv;
    Button crscomplete;
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

        crscomplete = findViewById(R.id.crs_complete);
        crscomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourseCompleted();
            }
        });
        }
            public void openCourseCompleted() {
                Intent intent = new Intent(this, CourseCompleted.class);
                startActivity(intent);
            }


}