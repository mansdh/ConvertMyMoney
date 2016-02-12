package com.example.hewlett_packard.convertmymoneyapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    SharedPreferences misDatos;
    private String fromx, tox;
    private TextView cfromtxt, ctotxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Pantalla2 = (Button) findViewById(R.id.bcurr);
        Pantalla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }

        });
        ctotxt=(TextView)findViewById(R.id.cto);
        tox=ctotxt.getText().toString();



    }
/*
    protected  void onRestart(){
        super.onRestart();

        cfromtxt=(TextView)findViewById(R.id.cfrom);
        ctotxt=(TextView) findViewById(R.id.cto);

        misDatos=getSharedPreferences("Datos", 0);
        fromx= misDatos.getString("From","MM");
        tox= misDatos.getString("To","MM");
        cfromtxt.setText(fromx);
        ctotxt.setText(tox);




    }
    */

    public void onClickConv(View view){

        Toast.makeText(MainActivity.this, tox, Toast.LENGTH_LONG).show();

    }
}

