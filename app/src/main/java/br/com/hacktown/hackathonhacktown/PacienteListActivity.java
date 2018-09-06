package br.com.hacktown.hackathonhacktown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PacienteListActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_list);

        List listPacientes = new ArrayList();
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");
        listPacientes.add("José da Silva");

        PacienteAdapter adapter = new PacienteAdapter(this, listPacientes);

        listView = findViewById(R.id.listview);

        listView.setAdapter(adapter);

    }
}
