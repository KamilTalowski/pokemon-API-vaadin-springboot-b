package com.talowski.pokemonapivaadinspringbootb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    @JsonProperty("cards")
    public ArrayList<Card> getCards() {
		 return this.cards; } 
    public void setCards(ArrayList<Card> cards) { 
		 this.cards = cards; } 
    ArrayList<Card> cards;

    @Override
    public String toString() {
        return "Root{" +
                "cards=" + cards +
                '}';
    }
}
