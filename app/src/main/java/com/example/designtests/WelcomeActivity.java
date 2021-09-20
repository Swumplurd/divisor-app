package com.example.designtests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btn_login, btn_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btn_login = (Button) findViewById(R.id.btn_op_is);
        btn_registro = (Button) findViewById(R.id.btn_op_r);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(view);
            }
        });

        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registro(view );
            }
        });

    }

    private void login(View view){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
    }

    private void registro(View view){
        Intent registro = new Intent(this, RegisterActivity.class);
        startActivity(registro);
    }
}