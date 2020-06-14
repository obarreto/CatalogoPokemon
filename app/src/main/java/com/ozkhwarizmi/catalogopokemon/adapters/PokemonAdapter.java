package com.ozkhwarizmi.catalogopokemon.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ozkhwarizmi.catalogopokemon.entities.Pokemon;

import java.util.List;

public class PokemonAdapter extends BaseAdapter {
    private Context context;
    private List<Pokemon> lstPokemon;

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

        return null;
    }
}

