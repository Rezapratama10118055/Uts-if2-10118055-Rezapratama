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

    ;
    private Button selanjut;
    private RadioGroup grubradio,grubradio2;
    private String KEY_Nim = "nim";
    private String KEY_Nama = "nama";
    private String KEY_tanggal= "tanggal";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     EditText nimaku = findViewById(R.id.nim);
       EditText namaku = findViewById(R.id.nama);
       EditText dateku = findViewById(R.id.Date);
      selanjut = findViewById(R.id.selanjutnya);
      selanjut.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              try{
                  String nim = nimaku.getText().toString();
                  if (nim != null && nim != ""){
                      Intent i = new Intent(MainActivity.this, Kirimdata.class);
                      i.putExtra(KEY_Nim, nim);
                      startActivity(i);

                  } else {
                      Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                  }

              } catch (Exception e){
                  e.printStackTrace();
                  Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
              }

              try{
                  String nama = namaku.getText().toString();
                  if (nama != null && nama != ""){
                      Intent i = new Intent(MainActivity.this, Kirimdata.class);
                      i.putExtra(KEY_Nama, nama);
                      startActivity(i);

                  } else {
                      Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                  }

              } catch (Exception e){
                  e.printStackTrace();
                  Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
              }

              try{
                  String date = dateku.getText().toString();
                  if (date != null && date != ""){
                      Intent i = new Intent(MainActivity.this, Kirimdata.class);
                      i.putExtra(KEY_Nim, date);
                      startActivity(i);

                  } else {
                      Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME",Toast.LENGTH_SHORT);
                  }

              } catch (Exception e){
                  e.printStackTrace();
                  Toast.makeText(getApplication(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
              }



          }
      });




    }
}