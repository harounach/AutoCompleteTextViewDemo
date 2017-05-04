package com.ach.haroun.fujitsu.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] compleletion = {"Engineer","Engineering", "Electric","Elementary", "element","England"};
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autocomplete_id);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, compleletion);
        autoCompleteTextView.setAdapter(adapter);
    }
}
