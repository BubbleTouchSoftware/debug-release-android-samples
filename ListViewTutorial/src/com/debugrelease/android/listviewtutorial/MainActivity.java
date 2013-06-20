package com.debugrelease.android.listviewtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private static final String[] lakes = {
            "Superior",
            "Victoria",
            "Huron",
            "Michigan",
            "Tanganyika",
            "Baikal",
            "Great Bear Lake",
            "Great Slave Lake",
            "Erie",
            "Winnipeg",
            "Ontario",
            "Balkhash",
            "Ladoga",
            "Vostok",
            "Onega",
            "Titicaca",
            "Nicaragua",
            "Athabasca" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lakes);
        listView.setAdapter(adapter);

    }
}
