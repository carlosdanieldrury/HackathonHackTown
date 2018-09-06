package br.com.hacktown.hackathonhacktown;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class PacienteAdapter extends BaseAdapter {

    private Activity activity;
    private List pacientes;

    public PacienteAdapter(Activity activity, List pacientes) {
        this.activity = activity;
        this.pacientes = pacientes;
    }

    @Override
    public int getCount() {
        return pacientes.size();
    }

    @Override
    public Object getItem(int i) {
        return pacientes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return pacientes.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View viewRoot = activity.getLayoutInflater().inflate(R.layout.item_paciente, viewGroup, false);

        return viewRoot;
    }
}
