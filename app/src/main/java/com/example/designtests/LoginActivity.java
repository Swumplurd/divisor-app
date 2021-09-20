package com.example.designtests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button iniciar_secion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.et_email_login);
        password = (EditText) findViewById(R.id.et_password_login);
        iniciar_secion = (Button) findViewById(R.id.btn_is_login);

        iniciar_secion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logear(view);
            }
        });

    }
    private void logear (View view){
        Intent logear = new Intent(this, DivisorActivity.class);
        startActivity(logear);
    }
}