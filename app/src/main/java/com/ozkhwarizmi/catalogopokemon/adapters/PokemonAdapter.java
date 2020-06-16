package com.ozkhwarizmi.catalogopokemon.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ozkhwarizmi.catalogopokemon.DetailsPokemon;
import com.ozkhwarizmi.catalogopokemon.R;
import com.ozkhwarizmi.catalogopokemon.entities.Pokemon;

import java.util.List;

public class PokemonAdapter extends BaseAdapter {
    private Context context;
    private List<Pokemon> lstPokemon;

    public PokemonAdapter(Context context, List<Pokemon> lstPokemon) {
        this.context = context;
        this.lstPokemon = lstPokemon;
    }

    @Override
    public int getCount() {
        return lstPokemon.size();
    }

    @Override
    public Object getItem(int position) {
        return lstPokemon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View inflater = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent, false);

        TextView txtNome = inflater.findViewById(R.id.nome);

        /*txtNome.setText(lstPokemon.get(position).getName()); /*OU*/

        Pokemon pokemon = lstPokemon.get(position);
        txtNome.setText(pokemon.getName());

        inflater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context, DetailsPokemon.class);
                it.putExtra("pokemon", pokemon);
                context.startActivity(it);
            }
        });

        return inflater;
    }
}

