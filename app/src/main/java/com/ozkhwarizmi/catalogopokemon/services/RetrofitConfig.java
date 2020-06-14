package com.ozkhwarizmi.catalogopokemon.services;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
public class RetrofitConfig {
    public static final String BASE_PATH = "https://pokeapi.co/api/v2/";
    private Retrofit retrofit;
    public RetrofitConfig(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_PATH)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public PokemonService getPokemonService(){
        return this.retrofit.create(PokemonService.class);
    }
}
