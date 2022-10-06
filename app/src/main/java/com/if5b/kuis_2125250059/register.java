package com.if5b.kuis_2125250059;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        private EditText etNama, etemail;
        private Button btnDaftar;
        private Spinner spNegara;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etNama = findViewById(R.id.et_username);
            etemail = findViewById(R.id.et_email);

            btnDaftar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nama = etNama.getText().toString();
                    String email = etemail.getText().toString();


                    if(nama.trim().equals("") || email.trim().equals("")){
                        if(nama.trim().equals("")){
                            etNama.setError("Nama tidak boleh kosong");
                        }
                        if(email.trim().equals("")){
                            etemail.setError("No Whatsapp tidak boleh kosong");
                    }
                    else{
                        Intent intent = new Intent(MainActivity.this, Result.class);
                        intent.putExtra("varNama", nama);
                        intent.putExtra("varemail", email);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}