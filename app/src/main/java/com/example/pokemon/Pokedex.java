package com.example.pokemon;

import java.util.List;

public class Pokedex extends AbstractPokemon {
    @Override
    public List createPokemon(String name, int health, String type) {
        return super.createPokemon(name, health, type);
    }

    @Override
    public Pokemon pokemonInfo(Pokemon pokemon) {
        return super.pokemonInfo(pokemon);
    }

    @Override
    public void listPokemon() {
        super.listPokemon();
    }
}
