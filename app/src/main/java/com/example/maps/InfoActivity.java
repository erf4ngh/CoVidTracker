package com.example.maps;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class InfoActivity extends AppCompatActivity {

    //Ontario stats from gov website
    int negCases = 33240;
    int invCases = 8690;
    int conCases = 1117;
    int resCases = 8;
    int deaths = 19;
    int total = 43072;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Total Positive Cases: " + conCases, R.drawable.add),
                //new MyListData("Total Negative Cases: " + negCases, android.R.drawable.ic_dialog_info),
                new MyListData("Deceased: " + deaths, R.drawable.dead),
                new MyListData("Recovered: " + resCases, R.drawable.heal),
                new MyListData("Cases under investigation: " + invCases, R.drawable.search),
                new MyListData("The province has enacted a declaration of emergency to help contain the spread of COVID-19 and protect the public."
                        , R.drawable.warn)
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}