package com.afriza.drawernavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewMain extends AppCompatActivity {
    //data dalam bentuk array
    String[] listArray={"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
            "Agustus", "September", "Oktober", "November", "Desember"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_main);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_listview,listArray);
        ListView listview =(ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }
}
