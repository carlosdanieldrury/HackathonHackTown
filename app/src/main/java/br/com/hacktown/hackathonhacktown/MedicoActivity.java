package br.com.hacktown.hackathonhacktown;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MedicoActivity extends AppCompatActivity {

    private TextView tvNumOrgaos;
    private TextView tvNumPacientes;

    private Button btVerPacientes;
    private Button btTransferirOrgao;
    private Button btCadastrarDoador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medico);

        tvNumOrgaos = findViewById(R.id.tv_num_orgaos);
        tvNumPacientes = findViewById(R.id.tv_num_pacientes);

        tvNumPacientes.setText(Integer.toString(AppConstants.NUM_PACIENTES));
        tvNumOrgaos.setText(Integer.toString(AppConstants.NUM_ORGAOS));

        btVerPacientes = findViewById(R.id.bt_ver_pacientes);
        btTransferirOrgao = findViewById(R.id.bt_transferir_orgao);
        btCadastrarDoador = findViewById(R.id.bt_cad_doador);

        btCadastrarDoador.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastratDoadorActivity.class));
        });

        btVerPacientes.setOnClickListener(v -> {
            startActivity(new Intent(this, PacienteListActivity.class));
        });

        btTransferirOrgao.setOnClickListener(v -> {
            startActivity(new Intent(this, TransferenciaActivity.class));
        });


    }
}
