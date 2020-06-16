package com.ozkhwarizmi.catalogopokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ozkhwarizmi.catalogopokemon.entities.Pokemon;

public class DetailsPokemon extends AppCompatActivity {
    Pokemon pokemon;
    TextView nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pokemon);
        Bundle bundle = getIntent().getExtras();
        Pokemon pokemon = (Pokemon) bundle.getSerializable("pokemon");
        this.nome.setText(pokemon.getName());
    }
}