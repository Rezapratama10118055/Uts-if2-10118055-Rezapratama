package com.example.utspraktik_if2_10118055_rezapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kirimdata extends AppCompatActivity {

Button ShowDialog;

TextView nimaku,namaku,tanggalku;
private String nim,nama,tanggal;

    private String KEY_Nim = "nim";
    private String KEY_Nama = "nama";
    private String KEY_tanggal= "tanggal";
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirimdata);


        nimaku = (TextView) findViewById(R.id.nim2);
        namaku = (TextView)findViewById(R.id.nama);
        tanggalku =(TextView)findViewById(R.id.tanggallahir);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString("nama");
        nim = extras.getString("nin");
        tanggal = extras.getString("tanggal");

        nimaku.setText(nama);
        namaku.setText(nim);
        tanggalku.setText(tanggal);


        ShowDialog = findViewById(R.id.button3);
        ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(Kirimdata.this);

                dialog.setTitle("Tentang Saya");
                dialog.setContentView(R.layout.dialog);
                Button DialogButton = dialog.findViewById(R.id.button4);
                DialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }




    }
