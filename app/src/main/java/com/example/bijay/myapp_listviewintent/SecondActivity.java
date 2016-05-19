package com.example.bijay.myapp_listviewintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Bijay on 19-05-2016.
 */
public class SecondActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivitylayout);

        Intent intent = getIntent();
        String course = intent.getExtras().getString("CourseName");
        String mentor = intent.getExtras().getString("Mentor");

        Toast.makeText(getApplicationContext(), "Mentor for Course " + course + " : " + mentor, Toast.LENGTH_LONG).show();
    }
}
