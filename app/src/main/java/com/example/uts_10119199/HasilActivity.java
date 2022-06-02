package com.example.uts_10119199;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;

public class HasilActivity extends AppCompatActivity {

    TextView receiver_NIK, receiver_Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        receiver_NIK = (TextView)findViewById(R.id.nik);
        receiver_Nama = (TextView)findViewById(R.id.nama);
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = intent.getStringExtra("message_key");
        String nm = intent.getStringExtra("message_key");

        // display the string into textView
        receiver_NIK.setText(str);
        receiver_Nama.setText(nm);
    }
}