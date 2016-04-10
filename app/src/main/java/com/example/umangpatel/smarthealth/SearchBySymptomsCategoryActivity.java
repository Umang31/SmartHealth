package com.example.umangpatel.smarthealth;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SearchBySymptomsCategoryActivity extends AppCompatActivity{
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_symptoms_category);

        wv = (WebView) findViewById(R.id.webView_SearchBySymptoms);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://symptoms.webmd.com");
    }
}