package com.example.avas.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.lv_car);

        String[] carModels = getResources().getStringArray(R.array.models);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, carModels);

        listView.setAdapter(adapter);
    }
}
