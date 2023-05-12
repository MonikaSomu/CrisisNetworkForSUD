package com.example.crisisnetwork;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticalActivity extends AppCompatActivity {

    TextView txtart1, txtart2, txtart3, txtart4;
    ImageView art1, art2, art3, art4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artical);

        txtart1 = findViewById(R.id.txtarticle1);
        art1 = findViewById(R.id.article1);
        txtart2 = findViewById(R.id.textarticle2);
        art2 = findViewById(R.id.article2);
        txtart3 = findViewById(R.id.textarticle3);
        art3 = findViewById(R.id.article3);
        txtart4 = findViewById(R.id.textarticle4);
        art4 = findViewById(R.id.article4);

        txtart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.nimh.nih.gov/health/topics/substance-use-and-mental-health#:~:text=Occurring%20Mental%20Disorders-,Overview,most%20severe%20form%20of%20SUD.");

            }
        });
        art1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.nimh.nih.gov/health/topics/substance-use-and-mental-health#:~:text=Occurring%20Mental%20Disorders-,Overview,most%20severe%20form%20of%20SUD.");
            }
        });
        txtart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.samhsa.gov/find-help/prevention");
            }
        });
        art2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.samhsa.gov/find-help/prevention");
            }
        });
        txtart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.recoveryranch.com/addiction-blog/addiction-treatment-5-foods-to-help-your-body-heal/");
            }
        });
        art3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.recoveryranch.com/addiction-blog/addiction-treatment-5-foods-to-help-your-body-heal/");
            }
        });
        txtart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://westernhealth.nl.ca/uploads/Addictions%20Prevention%20and%20Mental%20Health%20Promotion/SU%20Prevention%20Activities%20-%202017.pdf");
            }
        });
        art4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://westernhealth.nl.ca/uploads/Addictions%20Prevention%20and%20Mental%20Health%20Promotion/SU%20Prevention%20Activities%20-%202017.pdf");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW , uri));
    }
}