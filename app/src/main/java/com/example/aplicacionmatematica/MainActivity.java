package com.example.aplicacionmatematica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText txtnum1,txtnum2,txtresultado;
    Button btnsuma, btnresta,btnmulti,btndividir,btnlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1= (EditText) findViewById(R.id.txtNum1);
        txtnum2= (EditText) findViewById(R.id.txtNum2);
        txtresultado= (EditText) findViewById(R.id.txtResultado);
        btnsuma= (Button) findViewById(R.id.btnsuma);
        btnresta= (Button) findViewById(R.id.btnresta);
        btnmulti= (Button) findViewById(R.id.btnmulti);
        btndividir= (Button) findViewById(R.id.btndividir);
        btnlimpiar=(Button) findViewById(R.id.btnlimpiar);


        btnsuma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.valueOf(txtnum1.getText().toString());
                int num2 = Integer.valueOf(txtnum2.getText().toString());
                int resultado = num1 + num2;
                txtresultado.setText(""+resultado);
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.valueOf(txtnum1.getText().toString());
                int num2 = Integer.valueOf(txtnum2.getText().toString());
                int resultado = num1 - num2;
                txtresultado.setText(""+resultado);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.valueOf(txtnum1.getText().toString());
                int num2 = Integer.valueOf(txtnum2.getText().toString());
                int resultado = num1 * num2;
                txtresultado.setText(""+resultado);
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int num1 = Integer.valueOf(txtnum1.getText().toString());
                int num2 = Integer.valueOf(txtnum2.getText().toString());
                int resultado = num1 / num2;
                txtresultado.setText(""+resultado);
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtnum1.setText("");
                txtnum2.setText("");
                txtresultado.setText("");

            }
        });

    }

}