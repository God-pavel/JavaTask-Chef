package com.company.model;

public enum Vegetables implements SaladComponent {

    TOMATO(50,3),
    CUCUMBER(20,2),
    ONION(80,1),
    BELL_PEPPER(60, 1),
    LETTUCE(5,10);

    private int caloriesPerUnit;
    private int amount;

    Vegetables(int caloriesPerUnit, int amount){
        this.caloriesPerUnit = caloriesPerUnit;
        this.amount = amount;
    }

    @Override
    public final double calcCalories(){
        return amount*caloriesPerUnit;
    }
    public final String getName(){
        return this.name();
    }

}
