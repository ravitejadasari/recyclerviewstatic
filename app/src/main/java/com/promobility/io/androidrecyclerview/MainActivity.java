package com.promobility.io.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.promobility.io.androidrecyclerview.data.Data;
import com.promobility.io.androidrecyclerview.model.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() + " --> ";
    RecyclerView rv_list;
    ArrayList<DataModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_list = findViewById(R.id.rv_list);

        rv_list.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_list.setLayoutManager(linearLayoutManager);

        data = new ArrayList<DataModel>();
        for (int i = 0; i < Data.androidVersionNumber.length; i++) {
            data.add(new DataModel(Data.androidVersionName[i], Data.androidVersionNumber[i]));
            Log.d(TAG, "onCreate: " + Data.androidVersionName[i] + " -- " + Data.androidVersionNumber[i]);
        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(),data);
        rv_list.setAdapter(recyclerViewAdapter);


    }
}
