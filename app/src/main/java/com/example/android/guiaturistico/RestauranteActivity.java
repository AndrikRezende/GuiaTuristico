package com.example.android.guiaturistico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RestauranteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atracao_list);
        List<Atracao> atracoes = new ArrayList<Atracao>();
        atracoes.add(new Atracao(R.string.nome_restaurante,R.string.horario_restaurante,
                R.string.endereco_restaurante,R.string.telefone_restaurante,Atracao.semImagem));
        AtracaoAdapter adapter = new AtracaoAdapter(this,atracoes,R.color.colorRestaurante);
        ListView listView = (ListView) findViewById(R.id.id_list);
        listView.setAdapter(adapter);
    }
}
