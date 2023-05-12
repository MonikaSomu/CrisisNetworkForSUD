package com.example.crisisnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.article);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHelperActivity();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArticalActivity();
            }
        });

    }
    public void openPatientActivity()
    {
        Intent intent = new Intent(this,PatientHomePage.class);
        startActivity(intent);
    }
    public void openHelperActivity()
    {
        Intent intent = new Intent(this, HelperActivity.class);
        startActivity(intent);
    }
    public void openArticalActivity()
    {
        Intent intent = new Intent(this, ArticalActivity.class);
        startActivity(intent);
    }

}