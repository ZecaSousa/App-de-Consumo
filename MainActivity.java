package com.zecassales.consumo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    double valorEtanol = 0.0;
    double valorGasolina ;

    String resultadoEtanol = "O valor do Etanol esta mais favoravel pra ser abastecido.";
    String resultadoGasolina = "O valor da Gasolina esta mais favoravel pra ser abastecido.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarResultado(View view){

        TextView mostrarResultado = findViewById(R.id.textResultado);
        TextView colherCombustivel =  findViewById(R.id.valorDaGasolina);
        TextView colherEtanol =  findViewById(R.id.valorDoEtanol);


        valorGasolina = Double.parseDouble(String.valueOf(colherCombustivel.getText()));
        valorEtanol = Double.parseDouble(String.valueOf(colherEtanol.getText()));

        double calculo = valorEtanol / valorGasolina;
        if(calculo < 0.7){

            mostrarResultado.setText(resultadoEtanol);

        }else if (calculo > 0.7){

            mostrarResultado.setText(resultadoGasolina);

        }
    }
}