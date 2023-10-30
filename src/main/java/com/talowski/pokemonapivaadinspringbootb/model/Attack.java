package com.talowski.pokemonapivaadinspringbootb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Attack{
    @JsonProperty("cost")
    public ArrayList<String> getCost() {
		 return this.cost; } 
    public void setCost(ArrayList<String> cost) { 
		 this.cost = cost; } 
    ArrayList<String> cost;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("text") 
    public String getText() { 
		 return this.text; } 
    public void setText(String text) { 
		 this.text = text; } 
    String text;
    @JsonProperty("damage") 
    public String getDamage() { 
		 return this.damage; } 
    public void setDamage(String damage) { 
		 this.damage = damage; } 
    String damage;
    @JsonProperty("convertedEnergyCost") 
    public int getConvertedEnergyCost() { 
		 return this.convertedEnergyCost; } 
    public void setConvertedEnergyCost(int convertedEnergyCost) { 
		 this.convertedEnergyCost = convertedEnergyCost; } 
    int convertedEnergyCost;

    @Override
    public String toString() {
        return "Attack{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", damage='" + damage + '\'' +
                ", convertedEnergyCost=" + convertedEnergyCost +
                '}';
    }
}
