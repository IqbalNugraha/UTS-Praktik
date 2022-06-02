package com.example.uts_10119199;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

//2 Juni 2022, IF5, 10119199, IqbalFaturNugraha
public class MainActivity extends AppCompatActivity {

    Button lanjut;
    EditText nik, nama;
    boolean isAllFieldsChecked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //button
        lanjut = findViewById(R.id.btn_lanjut);

        //editText
        nik = findViewById(R.id.edit_nik);
        nama = findViewById(R.id.edit_nama);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // store the returned value of the dedicated function which checks
                // whether the entered data is valid or if any fields are left blank.
                isAllFieldsChecked = CheckAllFields();

                // the boolean variable turns to be true then
                // only the user must be proceed to the activity2
                if (isAllFieldsChecked) {
                    String str = nik.getText().toString();
                    String nm = nama.getText().toString();
                    Intent i = new Intent(MainActivity.this, HasilActivity.class);
                    i.putExtra("message_key",str);
                    i.putExtra("message_key",nm);
                    startActivity(i);
                }
            }
        });
    }
    private boolean CheckAllFields() {
        if (nik.length() == 0) {
            nik.setError("Harap Diisi");
            return false;
        }
        return true;
    }
}