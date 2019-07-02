package com.company.model;

/**
 * Интерфейс компонентов салата.
 *
 * @author Павел Панкратов
 * @version 1.0
 */

public interface SaladComponent {

    /**
     * Метод подсчета калорийности компонента
     */
    float calcCalories();

    /**
     * Метод получения имени компонента
     */
    String getName();

}
