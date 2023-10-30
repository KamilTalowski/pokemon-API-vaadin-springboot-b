package com.talowski.pokemonapivaadinspringbootb.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;

public class Card{
    @JsonProperty("id")
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("nationalPokedexNumber") 
    public int getNationalPokedexNumber() { 
		 return this.nationalPokedexNumber; } 
    public void setNationalPokedexNumber(int nationalPokedexNumber) { 
		 this.nationalPokedexNumber = nationalPokedexNumber; } 
    int nationalPokedexNumber;
    @JsonProperty("imageUrl") 
    public String getImageUrl() { 
		 return this.imageUrl; } 
    public void setImageUrl(String imageUrl) { 
		 this.imageUrl = imageUrl; } 
    String imageUrl;
    @JsonProperty("imageUrlHiRes") 
    public String getImageUrlHiRes() { 
		 return this.imageUrlHiRes; } 
    public void setImageUrlHiRes(String imageUrlHiRes) { 
		 this.imageUrlHiRes = imageUrlHiRes; } 
    String imageUrlHiRes;
    @JsonProperty("types") 
    public ArrayList<String> getTypes() { 
		 return this.types; } 
    public void setTypes(ArrayList<String> types) {
		 this.types = types; } 
    ArrayList<String> types;
    @JsonProperty("supertype") 
    public String getSupertype() { 
		 return this.supertype; } 
    public void setSupertype(String supertype) { 
		 this.supertype = supertype; } 
    String supertype;
    @JsonProperty("subtype") 
    public String getSubtype() { 
		 return this.subtype; } 
    public void setSubtype(String subtype) { 
		 this.subtype = subtype; } 
    String subtype;
    @JsonProperty("hp") 
    public String getHp() { 
		 return this.hp; } 
    public void setHp(String hp) { 
		 this.hp = hp; } 
    String hp;
    @JsonProperty("retreatCost") 
    public ArrayList<String> getRetreatCost() { 
		 return this.retreatCost; } 
    public void setRetreatCost(ArrayList<String> retreatCost) { 
		 this.retreatCost = retreatCost; } 
    ArrayList<String> retreatCost;
    @JsonProperty("convertedRetreatCost") 
    public int getConvertedRetreatCost() { 
		 return this.convertedRetreatCost; } 
    public void setConvertedRetreatCost(int convertedRetreatCost) { 
		 this.convertedRetreatCost = convertedRetreatCost; } 
    int convertedRetreatCost;
    @JsonProperty("number") 
    public String getNumber() { 
		 return this.number; } 
    public void setNumber(String number) { 
		 this.number = number; } 
    String number;
    @JsonProperty("artist") 
    public String getArtist() { 
		 return this.artist; } 
    public void setArtist(String artist) { 
		 this.artist = artist; } 
    String artist;
    @JsonProperty("rarity") 
    public String getRarity() { 
		 return this.rarity; } 
    public void setRarity(String rarity) { 
		 this.rarity = rarity; } 
    String rarity;
    @JsonProperty("series") 
    public String getSeries() { 
		 return this.series; } 
    public void setSeries(String series) { 
		 this.series = series; } 
    String series;
    @JsonProperty("set") 
    public String getSet() { 
		 return this.set; } 
    public void setSet(String set) { 
		 this.set = set; } 
    String set;
    @JsonProperty("setCode") 
    public String getSetCode() { 
		 return this.setCode; } 
    public void setSetCode(String setCode) { 
		 this.setCode = setCode; } 
    String setCode;
    @JsonProperty("attacks") 
    public ArrayList<Attack> getAttacks() {
		 return this.attacks; } 
    public void setAttacks(ArrayList<Attack> attacks) { 
		 this.attacks = attacks; } 
    ArrayList<Attack> attacks;
    @JsonProperty("weaknesses") 
    public ArrayList<Weakness> getWeaknesses() { 
		 return this.weaknesses; } 
    public void setWeaknesses(ArrayList<Weakness> weaknesses) { 
		 this.weaknesses = weaknesses; } 
    ArrayList<Weakness> weaknesses;
    @JsonProperty("ability") 
    public Ability getAbility() {
		 return this.ability; } 
    public void setAbility(Ability ability) { 
		 this.ability = ability; } 
    Ability ability;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nationalPokedexNumber=" + nationalPokedexNumber +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageUrlHiRes='" + imageUrlHiRes + '\'' +
                ", types=" + types +
                ", supertype='" + supertype + '\'' +
                ", subtype='" + subtype + '\'' +
                ", hp='" + hp + '\'' +
                ", retreatCost=" + retreatCost +
                ", convertedRetreatCost=" + convertedRetreatCost +
                ", number='" + number + '\'' +
                ", artist='" + artist + '\'' +
                ", rarity='" + rarity + '\'' +
                ", series='" + series + '\'' +
                ", set='" + set + '\'' +
                ", setCode='" + setCode + '\'' +
                ", attacks=" + attacks +
                ", weaknesses=" + weaknesses +
                ", ability=" + ability +
                '}';
    }
}
