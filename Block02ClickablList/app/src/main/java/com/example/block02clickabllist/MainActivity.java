package com.example.block02clickabllist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewAnimals = (ListView)findViewById(R.id.listView);
        final ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this,
                R.array.animalsArray,
                android.R.layout.simple_list_item_1);

        listViewAnimals.setAdapter(adapterAnimals);

        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String message = getString(R.string.toastMessage) + adapterAnimals.getItem(position);
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            }
        });
    }
}