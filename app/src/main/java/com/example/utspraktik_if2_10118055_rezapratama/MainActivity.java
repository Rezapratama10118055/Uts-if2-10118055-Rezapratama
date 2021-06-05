package com.example.utspraktik_if2_10118055_rezapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText nim,nama,date;
    private Button selanjut;
    private RadioGroup grubradio,grubradio2;
    public static final String EXTRA_MESSAGE = "com.example.utspraktik_if2_10118055_rezapratama";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      nim = findViewById(R.id.nim);
         nama = findViewById(R.id.nama);
         date = findViewById(R.id.Date);
      selanjut = findViewById(R.id.selanjutnya);
      selanjut.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(MainActivity.this,Kirimdata.class);
              EditText editText = (EditText) findViewById(R.id.nim);
              EditText editText1 = (EditText) findViewById(R.id.nama);
              EditText editText2 = (EditText) findViewById(R.id.Date);
              String message = editText.getText().toString();
              String message1 = editText1.getText().toString();
              String message2 = editText2.getText().toString();
              intent.putExtra(EXTRA_MESSAGE,message);
              startActivity(intent);
          }
      });




    }
}