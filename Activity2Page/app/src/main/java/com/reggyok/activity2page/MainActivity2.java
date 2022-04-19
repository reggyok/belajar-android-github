package com.reggyok.activity2page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtHalo;
    private String nama;
    private String key_name = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtHalo = (TextView) findViewById(R.id.txtHalo);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(key_name);
        txtHalo.setText("Halo " + nama);
    }
}