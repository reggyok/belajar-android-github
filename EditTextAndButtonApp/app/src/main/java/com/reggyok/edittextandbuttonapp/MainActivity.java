package com.reggyok.edittextandbuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOK = findViewById(R.id.buttonOk);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNama = findViewById(R.id.editTextNama);
                TextView TextIndo = findViewById(R.id.textViewIfo);
                String nama = editNama.getText().toString();
                String pesan = "Hello, "+nama+"! ";
                TextIndo.setText(pesan);

            }
        });
    }
}