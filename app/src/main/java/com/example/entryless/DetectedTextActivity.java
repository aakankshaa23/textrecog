package com.example.entryless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DetectedTextActivity extends AppCompatActivity {
    TextView detectedText;
    String finalText="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detected_text);
        detectedText=findViewById(R.id.detectedtext);
        ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("list");
        for(int i=0;i<myList.size();i++){
            finalText+=myList.get(i);

        }
        detectedText.setText(finalText);



    }
}