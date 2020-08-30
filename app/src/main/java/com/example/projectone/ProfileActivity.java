package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView heading,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        heading= findViewById(R.id.detailsHeadingId);
        details= findViewById(R.id.detailsId);

        String value= getIntent().getStringExtra("player_name");

        if(value.equals("Messi")){
            setTitle("Messi");
            heading.setText("Messi Details");
            details.setText(R.string.Messi);
        }
        else if(value.equals("Shakib")){
            setTitle("Shakib");
            heading.setText("Shakib Details");
            details.setText(R.string.Shakib);

        }
        else if(value.equals("Neymar")){
            setTitle("Neymar");
            heading.setText("Neymar Details");
            details.setText(R.string.Neymar);

        }
        else if(value.equals("Mushfique")){
            setTitle("Mushfique");
            heading.setText("Mushfique Details");
            details.setText(R.string.Mushfique);

        }
        else if(value.equals("Tamim")){
            setTitle("Tamim");
            heading.setText("Tamim Details");
            details.setText(R.string.Tamim);

        }

    }
}