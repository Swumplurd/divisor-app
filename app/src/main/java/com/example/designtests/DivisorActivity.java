package com.example.designtests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;import android.os.Bundle;


public class DivisorActivity extends AppCompatActivity {

    public EditText divisor, dividendo;
    public TextView cociente, residuo1, residuo2;
    public Button btn_calcular;
    public String divisor_text, dividendo_text, cociente_texto, residuo_texto1, residuo_texto2;
    public int divisor_num, dividendo_num, cociente_num, residuo_num1, residuo_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisor);

        divisor = (EditText) findViewById(R.id.divisor);
        dividendo = (EditText) findViewById(R.id.dividendo);
        cociente = (TextView) findViewById(R.id.cociente);
        residuo1 = (TextView) findViewById(R.id.residuo1);
        residuo2 = (TextView) findViewById(R.id.residuo2);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                obtenerNum();
            }

            public void obtenerNum(){

                if(divisor.getText().toString().isEmpty() || dividendo.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext() , "Ingresa dos numeros por favor!", Toast.LENGTH_SHORT).show();
                } else {
                    divisor_text = divisor.getText().toString();
                    dividendo_text = dividendo.getText().toString();
                    divisor_num = Integer.parseInt(divisor_text);
                    dividendo_num = Integer.parseInt(dividendo_text);

                    if(divisor_num != 0){
                        operacion();
                        mostrar();
                    } else {
                        Toast.makeText(getApplicationContext() , "No se puede dividir entre 0!", Toast.LENGTH_SHORT).show();
                    }
                }

            }

            public void operacion(){
                cociente_num = dividendo_num / divisor_num;
                residuo_num1 = (cociente_num * divisor_num) * -1;
                residuo_num2 = dividendo_num + residuo_num1;
            }

            public void mostrar(){
                cociente_texto = Integer.toString(cociente_num);
                residuo_texto1 = Integer.toString(residuo_num1);
                residuo_texto2 = Integer.toString(residuo_num2);
                cociente.setText(cociente_texto);
                residuo1.setText(residuo_texto1);
                residuo2.setText(residuo_texto2);
            }
        });
    }
}