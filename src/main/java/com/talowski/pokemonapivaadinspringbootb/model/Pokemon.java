package com.talowski.pokemonapivaadinspringbootb.model;

public class Pokemon {
    private String name;
    private  PokemonType pokemonType;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", pokemonType=" + pokemonType +
                ", image='" + image + '\'' +
                '}';
    }
}
