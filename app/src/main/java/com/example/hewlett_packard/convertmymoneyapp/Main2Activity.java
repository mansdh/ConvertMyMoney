package com.example.hewlett_packard.convertmymoneyapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends ActionBarActivity {

    private Spinner SpinnerFrom;
    private Spinner SpinnerTo;
    SharedPreferences misDatos;
    private EditText editFrom, editTo;
    private String StFrom, StTo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Button Pantalla1 = (Button) findViewById(R.id.breturn);
        Pantalla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StFrom=SpinnerFrom.getSelectedItem().toString();
                StTo=SpinnerTo.getSelectedItem().toString();

                //Extrae el contenido de los spinners
                misDatos=getSharedPreferences("Datos",0);

                //Define un editor para misDatos
                SharedPreferences.Editor miEditor=misDatos.edit();
                miEditor.putString("From",StFrom);
                miEditor.putString("To", StTo);
                //salvar
                miEditor.commit();
                startActivity(new Intent(Main2Activity.this, MainActivity.class));



            }
        });

        SpinnerFrom = (Spinner) findViewById(R.id.cfrom2);
        SpinnerTo = (Spinner) findViewById(R.id.cto2);
        String [] money= getResources().getStringArray(R.array.money_array);
        ArrayAdapter<String> MyAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,money);
        SpinnerFrom.setAdapter(MyAdapter);
        SpinnerTo.setAdapter(MyAdapter);











    }
    @Override
    protected void onPause(){
        super.onPause();
        //Extrae el contenido de los campos de texto



    }


}
