package com.talowski.pokemonapivaadinspringbootb;

import com.talowski.pokemonapivaadinspringbootb.model.Pokemon;
import com.talowski.pokemonapivaadinspringbootb.model.PokemonType;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;



@Route
public class PokemonAdder extends VerticalLayout {

    @Autowired
    public PokemonAdder(PokemonDeck pokemonDeck) {
        TextField textFieldName= new TextField("name");
        TextField textFieldImage= new TextField("image");
        ComboBox<PokemonType> pokemonTypeComboBox = new ComboBox<>("Pokemon Type: ", PokemonType.values());
        Button buttonAdd = new Button("add new Pokemon!");

        Pokemon pokemon = new Pokemon();
        pokemon.setName(textFieldName.getValue());
        pokemon.setImage(textFieldImage.getValue());
        pokemon.setPokemonType(pokemonTypeComboBox.getValue());

        buttonAdd.addClickListener(clickEvent -> {
            pokemonDeck.getPokemons().add(pokemon);
        });

        add(textFieldName, textFieldImage, pokemonTypeComboBox, buttonAdd);
    }
}
