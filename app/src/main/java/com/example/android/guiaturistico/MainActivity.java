package com.example.android.guiaturistico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarActivity(R.id.id_praça,PracaActivity.class);
        iniciarActivity(R.id.id_restaurante,RestauranteActivity.class);
        iniciarActivity(R.id.id_clube,ClubeActivity.class);
        iniciarActivity(R.id.id_pizzaria,PizzariaActivity.class);
    }

    public void iniciarActivity(int id, final Class classe){
        TextView textView = (TextView) findViewById(id);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                Intent intent = new Intent(MainActivity.this, classe);
                startActivity(intent);
            }
        });
    }
}
