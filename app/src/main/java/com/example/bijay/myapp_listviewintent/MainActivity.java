package com.example.bijay.myapp_listviewintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> list;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{"Core Java", "Android", "Big Data",
                "Scala", "Linux", "Front End Basics", "Front End development", "Cloud Computing"};

        list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
    }

    public void onClick(View view) {
        int position = listview.getSelectedItemPosition();
        Intent intent = null;
        Bundle db = new Bundle();
        switch (position) {
            case 0:
                db.putString("CourseName", "Java");
                db.putString("Mentor", "Shravanthi");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 1:
                db.putString("CourseName", "Android");
                db.putString("Mentor", "Preetika");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 2:
                db.putString("CourseName", "Big Data");
                db.putString("Mentor", "Abhinandan");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 3:
                db.putString("CourseName", "Scala");
                db.putString("Mentor", "ACADGILD");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 4:
                db.putString("CourseName", "Linux");
                db.putString("Mentor", "ACADGILD");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 5:
                db.putString("CourseName", "Front End Basics");
                db.putString("Mentor", "Yaseen");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 6:
                db.putString("CourseName", "Front End Development");
                db.putString("Mentor", "Thara");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
            case 7:
                db.putString("CourseName", "Cloud Computing");
                db.putString("Mentor", "Bijay");
                intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtras(db);
                startActivity(intent);
                break;
        }
    }

}