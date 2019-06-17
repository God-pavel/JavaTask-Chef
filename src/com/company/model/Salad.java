package com.company.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salad {
    private List <SaladComponent> components;

    public Salad(){
        components = new ArrayList<>();
        components.addAll(Arrays.asList(Vegetables.values()));
        components.addAll(Arrays.asList(OtherComponents.values()));
    }

    public List<SaladComponent> getComponents(){return components;}



    public int calculateSaladCalories(){
        int calories = 0;
        for(SaladComponent component : components){
            calories+=component.calcCalories();
        }
        return calories;
    }

    public List<SaladComponent> findByCalorie(int lowerLimit, int upperLimit){
        List<SaladComponent> finded = new ArrayList<>();
        for(SaladComponent component : components){
           if(component.calcCalories() > lowerLimit && component.calcCalories() < upperLimit){
               finded.add(component);
           }
        }
        return finded;
    }



    public void sortByCalorie(){
        components.sort(new SortByCalories());
    }
}
