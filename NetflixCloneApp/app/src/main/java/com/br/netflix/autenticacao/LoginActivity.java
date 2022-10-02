package com.br.netflix.autenticacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.br.netflix.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        configCliques();
    }

    private void configCliques() {
        findViewById(R.id.btnCadastro).setOnClickListener(view ->
                startActivity(new Intent(this, CadastroActivity.class)));
    }
}