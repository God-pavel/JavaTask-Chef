package com.company.model;

import java.util.Comparator;

public class SortByCalories implements Comparator<SaladComponent> {
    public int compare(SaladComponent a, SaladComponent b){
        return (int)(a.calcCalories() - b.calcCalories());
    }
}
