package com.example.atividade_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declara os objetos de tela
    EditText editNota01;
    EditText editNota02;
    EditText editNota03;
    EditText editNota04;
    EditText editMedia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNota01 = (EditText)findViewById(R.id.nota01);
        editNota02 = (EditText)findViewById(R.id.nota02);
        editNota03 = (EditText)findViewById(R.id.nota03);
        editNota04 = (EditText)findViewById(R.id.nota04);
        editMedia = (EditText)findViewById(R.id.media);

    }

    public void calculaMedia(){
        float nota01 = Float.parseFloat(editNota01.getText().toString());
        float nota02 = Float.parseFloat(editNota02.getText().toString());
        float nota03 = Float.parseFloat(editNota03.getText().toString());
        float nota04 = Float.parseFloat(editNota04.getText().toString());

        float media = ((nota01 + nota02 + nota03 + nota04) / 4);

        Intent i = new Intent(this,Resultado.class);
        i.putExtra("media", media);
        startActivity(i);

    }

}