package com.example.calculadora;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public double contador;
    EditText operando1, operando2;
    TextView textoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operando1 = (EditText)findViewById(R.id.numero1);
        operando2 = (EditText)findViewById(R.id.numero2);
        textoResultado = (TextView) findViewById(R.id.contador);
        contador = 0;
    }

    public void sumar(View vista) {
        double valor1 = Double.parseDouble(operando1.getText().toString());
        double valor2 = Double.parseDouble(operando2.getText().toString());
        double resultado = valor1 + valor2;

        textoResultado.setText(" " + resultado);
    }

    public void restar(View vista) {
        double valor1 = Double.parseDouble(operando1.getText().toString());
        double valor2 = Double.parseDouble(operando2.getText().toString());
        double contador = valor1 - valor2;

        textoResultado.setText(" " + contador);
    }

    public void multiplicar(View vista) {
        double valor1 = Double.parseDouble(operando1.getText().toString());
        double valor2 = Double.parseDouble(operando2.getText().toString());
        double contador = valor1 * valor2;

        textoResultado.setText(" " + contador);
    }

    public void dividir(View vista) {
        double valor1 = Double.parseDouble(operando1.getText().toString());
        double valor2 = Double.parseDouble(operando2.getText().toString());
        do{
            double contador = valor1 / valor2;
        }while(valor1 != 0);
        if(valor1 == 0){
            contador = 0;
        }
        textoResultado.setText(" " + contador);
    }

}