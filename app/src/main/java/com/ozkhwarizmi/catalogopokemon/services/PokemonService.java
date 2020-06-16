package com.ozkhwarizmi.catalogopokemon.services;

import com.ozkhwarizmi.catalogopokemon.entities.Detalhes;
import com.ozkhwarizmi.catalogopokemon.entities.Request;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonService {
    @GET("pokemon")
    Call<Request> getAll();

    @GET("pokemon/{nomePokemon}")
    Call<Detalhes> getDetailsPokemon(@Path("nomePokemon") String nomePokemon);
}
