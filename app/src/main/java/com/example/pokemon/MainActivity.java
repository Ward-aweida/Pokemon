package com.example.pokemon;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName);
        Pokemon pokemon = new Pokemon("pokemon4",19,"Tupe4");
        editText.setText(""+pokemon.toString());
    }
}