package com.example.android.guiaturistico;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Andrik on 25/02/2018.
 */

public class AtracaoAdapter extends ArrayAdapter<Atracao> {

    private int colorbackground;

    public AtracaoAdapter(Context context, List<Atracao> atracoes,int colorbackground) {
        super(context, 0, atracoes);
        this.colorbackground=colorbackground;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Atracao currentAtracao = getItem(position);

        TextView nomeTextView = (TextView) listItemView.findViewById(R.id.id_nome);
        nomeTextView.setText(currentAtracao.getNome());

        TextView enderecoTextView = (TextView) listItemView.findViewById(R.id.id_endereco);
        enderecoTextView.setText(currentAtracao.getEndereço());

        TextView horarioTextView = (TextView) listItemView.findViewById(R.id.id_horario);
        horarioTextView.setText(currentAtracao.getHorario());

        TextView telefoneTextView = (TextView) listItemView.findViewById(R.id.id_telefone);
        if(currentAtracao.temTelefone()){
            telefoneTextView.setText(currentAtracao.getTelefone());
            telefoneTextView.setVisibility(View.VISIBLE);
        }
        else
            telefoneTextView.setVisibility(View.GONE);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.id_imagem);
        if(currentAtracao.temImagem()){
            imageView.setImageResource(currentAtracao.getImagemId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.id_layout);
        int color = ContextCompat.getColor(getContext(), colorbackground);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
