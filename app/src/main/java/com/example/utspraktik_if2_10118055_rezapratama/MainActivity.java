package com.example.utspraktik_if2_10118055_rezapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button selanjut;
    private RadioGroup grubradio,grubradio2;
    private String KEY_Nim = "nim";
    private String KEY_Nama = "nama";
    private String KEY_tanggal= "tanggal";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Nama              : Reza Pratama
//        Kelas             : If-2
//        NIM               : 10118055
//        Tanggal Pengerjaan: 05 Juni 2021

     EditText nimaku = findViewById(R.id.nim);
       EditText namaku = findViewById(R.id.nama);
       EditText dateku = findViewById(R.id.Date);
      selanjut = findViewById(R.id.selanjutnya);
      selanjut.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String nama, nim, tanggal, kelamin, hubungan;

              nama = nimaku.getText().toString();
              nim = namaku.getText().toString();
              tanggal = dateku.getText().toString();


              Intent intent = new Intent(MainActivity.this, Kirimdata.class);
              intent.putExtra("nama", nama);
              intent.putExtra("nik", nim);
              intent.putExtra("tanggal", tanggal);
              startActivity(intent);

          }
      });




    }
}