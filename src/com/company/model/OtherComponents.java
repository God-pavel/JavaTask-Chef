package com.company.model;

public enum OtherComponents implements SaladComponent {

    FETA(264,200),
    OLIVE_OIL(864, 50),
    LEMON_JUICE(22,30);

    private int caloriesPerHundredGrams;
    private int mass;

    OtherComponents(int caloriesPerHundredGrams, int mass){
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.mass = mass;
    }

    @Override
    public final double calcCalories(){
        return (double)(mass*caloriesPerHundredGrams)/100;
    }
    public final String getName(){
        return this.name();
    }
}
