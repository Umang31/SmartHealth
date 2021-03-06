package com.example.umangpatel.smarthealth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;

public class TopLevelActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:911"));
                startActivity(intent);
            }
        });
    }

    public void listOfDiseases(View view){
        Intent intent = new Intent(TopLevelActivity.this, BrowseDiseaseCategoryActivity.class);
        startActivity(intent);
    }

    public void searchBySymptoms(View view){
        Intent intent = new Intent(TopLevelActivity.this, SearchBySymptomsCategoryActivity.class);
        startActivity(intent);
    }

    public void diseaseQuiz(View view){
        Intent intent = new Intent(TopLevelActivity.this, DiseaseQuiz.class);
        startActivity(intent);
    }

    public void emailDoctor(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:smarthealthdoctor@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Need Consultation");
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    public void showVideo(View view){
        Intent intent = new Intent(TopLevelActivity.this, ShowVideoCategoryActivity.class);
        startActivity(intent);
    }
}