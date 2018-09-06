package br.com.hacktown.hackathonhacktown;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button bt_entrar;
    private EditText et_username;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = findViewById(R.id.editText);

        bt_entrar = findViewById(R.id.button);
        bt_entrar.setOnClickListener(v -> {
            String username = et_username.getText().toString();

            switch (username) {
                case "medico":
                    Intent intentMedico = new Intent(LoginActivity.this, MedicoActivity.class);
                    startActivity(intentMedico);
                    finish();
                    break;
                case "paciente":
                    Intent intentPaciente = new Intent(LoginActivity.this, PacienteActivity.class);
                    startActivity(intentPaciente);
                    finish();
                    break;
                default:
                    return;
            }
        });

    }
}
