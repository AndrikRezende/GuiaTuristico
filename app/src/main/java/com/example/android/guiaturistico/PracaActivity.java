package com.example.android.guiaturistico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PracaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atracao_list);
        List<Atracao>atracoes = new ArrayList<Atracao>();
        atracoes.add(new Atracao(R.string.nome_praça,R.string.horario_praça,R.string.endereco_praça,
               Atracao.semTelefone,R.drawable.praca));
        AtracaoAdapter adapter = new AtracaoAdapter(this,atracoes,R.color.colorPraca);
        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(adapter);

    }
}
