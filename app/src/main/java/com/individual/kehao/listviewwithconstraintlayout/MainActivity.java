package com.individual.kehao.listviewwithconstraintlayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private sampleAdapter thisAdapter;
    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=MainActivity.this;

        listView = findViewById(R.id.list_here);
        List<ProfileListItem> data1 = new ArrayList<>();
        fillItem(data1, "Birthday");
        fillItem(data1, "Gender");
        fillItem(data1, "Country of origin");
        fillItem(data1, "Relationship Status");
        fillItem(data1, "Interested In");
        thisAdapter = new sampleAdapter(data1, context);
        listView.setAdapter(thisAdapter);

        data1.clear();
        listView = findViewById(R.id.list_there);
        fillItem(data1, "Birthday");
        fillItem(data1, "Gender");
        fillItem(data1, "Country of origin");
        fillItem(data1, "Relationship Status");
        fillItem(data1, "Interested In");
        thisAdapter = new sampleAdapter(data1, context);
        listView.setAdapter(thisAdapter);


    }

    private void fillItem(List<ProfileListItem> data, String item){
            data.add(new ProfileListItem(item, "-"));
    }


}
