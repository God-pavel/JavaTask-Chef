package com.company.model;

/**
 * Интерфейс компонентов салата.
 * @autor Павел Панкратов
 * @version 1.0
 */

public interface SaladComponent {

    /** Метод подсчета калорийности компонента */
    double calcCalories();
    /** Метод получения имени компонента */
    String getName();

}
