package com.example.calculadora;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    EditText operando1, operando2;
    TextView textoResultado;
    Spinner spinner;
    double valor1;
    double valor2;
    double resultado = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operando1 = (EditText)findViewById(R.id.numero1);
        operando2 = (EditText)findViewById(R.id.numero2);
        textoResultado = (TextView) findViewById(R.id.contador);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void sumar(View vista) {


        resultado = valor1 + valor2;

        textoResultado.setText(" " + resultado);
    }

    public void restar(View vista) {
        resultado = valor1 - valor2;

        textoResultado.setText(" " + resultado);
    }

    public void multiplicar(View vista) {
        resultado = valor1 * valor2;

        textoResultado.setText(" " + resultado);
    }

    public void dividir(View vista) {
        if (valor1 == 0 && valor2 == 0 || valor2 == 0) {
            Toast.makeText(this,"No se puede realizar esta división",Toast.LENGTH_LONG).show();
        }
        else {
            resultado = valor1 / valor2;
        }

        textoResultado.setText(" " + resultado);
    }
    public void calcular(View vista) {
        valor1 = Double.parseDouble(operando1.getText().toString());
        valor2 = Double.parseDouble(operando2.getText().toString());
        if (spinner.getSelectedItem().toString().equals("Sumar")) {
            sumar(null);
        }
        if (spinner.getSelectedItem().toString().equals("Restar")) {
            restar(null);
        }
        if (spinner.getSelectedItem().toString().equals("Multiplicar")) {
            multiplicar(null);
        }
        if (spinner.getSelectedItem().toString().equals("Dividir")) {
            dividir(null);
        }
    }
}