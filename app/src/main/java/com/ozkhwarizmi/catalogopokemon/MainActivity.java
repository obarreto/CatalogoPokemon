package com.ozkhwarizmi.catalogopokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.ozkhwarizmi.catalogopokemon.entities.Pokemon;
import com.ozkhwarizmi.catalogopokemon.entities.Request;
import com.ozkhwarizmi.catalogopokemon.services.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RetrofitConfig retrofitConfig;
    List<Pokemon> lstPokemon;
    ListView listPokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofitConfig = new RetrofitConfig();
        lstPokemon = new ArrayList<>();

        Call<Request> call = retrofitConfig.getPokemonService().getAll();
        call.enqueue(new Callback<Request>() {
            @Override
            public void onResponse(Call<Request> call, Response<Request> response) {
                Request request = response.body();
                if(request.getResults().size() > 0){
                    lstPokemon.clear();
                    lstPokemon.addAll(request.getResults());
                }
            }

            @Override
            public void onFailure(Call<Request> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Erro ao carregar Pokemon", Toast.LENGTH_LONG).show();
                lstPokemon.clear();
            }
        });
    }
}