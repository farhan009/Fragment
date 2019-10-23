package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Farhan", "Akash", "Rahat", "Sabiha", "Siyam"};
        listView = findViewById(R.id.listView_id);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;

        if (position == 0){
            fragment = new FarhansFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();

        }
        else if (position == 1){
            fragment = new AkashFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        }
        else if (position == 2){
            fragment = new RahatsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        }
        else if (position == 3){
            fragment = new SabihasFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        }
        else if (position == 4){
            fragment = new SiyamsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
        }
    }
}
