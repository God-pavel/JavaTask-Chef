package com.company.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс салат содержит компоненты салата и методы для них
 *
 * @author Павел Панкратов
 * @version 1.0
 */
public class Salad {

    /**
     * Поле список комонентов в салате
     */
    private List<SaladComponent> components;

    /**
     * Конструктор - инициализация и заполнения списка компонентов салата данными из Enum
     **/
    public Salad() {
        components = new ArrayList<>();
        components.addAll(Arrays.asList(Vegetables.values()));
        components.addAll(Arrays.asList(OtherComponents.values()));
    }

    /**
     * Метод получения списка компонентов
     *
     * @return возвращает список
     */
    public List<SaladComponent> getComponents() {
        return components;
    }


    /**
     * Метод подсчета калорийности салата
     *
     * @return возвращает калорийность
     */
    public double calculateSaladCalories() {

        return components.stream()
                .map(i->i.calcCalories())
                .reduce((double)0,(left,right)->left+right);
    }

    /**
     * Метод поиска компонентов салата в пределах заданой калорийности
     *
     * @param lowerLimit - нижняя граница
     * @param upperLimit - верхняя граница
     * @return возвращает список найденых компонентов
     */
    public List<SaladComponent> findByCalorie(int lowerLimit, int upperLimit) {

        return components.stream()
                .filter(i->i.calcCalories()<upperLimit && i.calcCalories()>lowerLimit)
                .collect(Collectors.toList());
    }

    /**
     * Метод сортировки списка компонентов за калорийностью
     */
    public void sortByCalorie() {
        components.sort((c1, c2) -> (int) (c1.calcCalories() - c2.calcCalories()));
    }
}
