package com.ozkhwarizmi.catalogopokemon.services;

import com.ozkhwarizmi.catalogopokemon.entities.Request;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonService {
    @GET("pokemon")
    Call<Request> getAll();

}
