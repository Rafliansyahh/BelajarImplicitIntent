package com.rafli.belajarimplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_url, et_lokasi, et_teks;
    Button btnBukawebsite, btnBukalokasi, btnBagikanTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_url          =findViewById(R.id.et_url);
        et_lokasi       =findViewById(R.id.et_lokasi);
        et_teks         =findViewById(R.id.et_teks);
        btnBukawebsite  =findViewById(R.id.btn_buka_website);
        btnBukalokasi   =findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks  =findViewById(R.id.btn_bagikan_teks);

        btnBukawebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = et_url. getText().toString();

                Uri uriUrlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    et_url.setError("URL Tidak Sesuai!");
                }





            }
        });

        btnBukalokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}