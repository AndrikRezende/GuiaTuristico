package com.example.android.guiaturistico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ClubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atracao_list);
        List<Atracao> atracoes = new ArrayList<Atracao>();
        atracoes.add(new Atracao(R.string.nome_clube,R.string.horario_clube,R.string.endereco_clube,
                R.string.telefone_clube,Atracao.semImagem));
        AtracaoAdapter adapter = new AtracaoAdapter(this,atracoes,R.color.colorClube);
        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(adapter);

    }
}
