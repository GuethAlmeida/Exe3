package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txt1;
    EditText txt2;
    TextView resultado;

    public void executar(View view) {

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        resultado = findViewById(R.id.textView);

        String s1 = txt1.getText().toString();
        String s2 = txt2.getText().toString();
        String s3 = s1 + " " + s2;

        if(s1.isEmpty() || s2.isEmpty()){
            Toast.makeText(MainActivity.this,"Nome não inserido",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(MainActivity.this,"Olá " + s3 ,Toast.LENGTH_LONG).show();
        }
    }
}