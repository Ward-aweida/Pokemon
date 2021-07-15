package com.example.pokemon;

import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class AbstractPokemon implements PokemonInterface {
    List pokemon;
    @Override
    public List createPokemon(String name, int health, String type) {
        pokemon =new ArrayList();
        Pokemon pokemon1 =new Pokemon("pokemon1",10,"type1");
        Pokemon pokemon2 =new Pokemon("pokemon2",11,"type2");
        pokemon.add(pokemon1);
        pokemon.add(pokemon2);
        return  pokemon;
    }

    @Override
    public Pokemon pokemonInfo(Pokemon pokemon) {
        return null;
    }

    @Override
    public void listPokemon() {

    }
}
