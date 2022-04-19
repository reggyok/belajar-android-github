package com.reggyok.activity2page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button btnKirim;

    private String key_name = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);

        btnKirim = (Button) findViewById(R.id.kirim);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String nama2 = nama.getText().toString();

                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra(key_name, nama2);
                    startActivity(i);
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error, Coba Lagi.", Toast.LENGTH_SHORT);
                }
            }
        });

    }
}