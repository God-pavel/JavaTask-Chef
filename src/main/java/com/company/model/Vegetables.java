package com.company.model;

/**
 * Enum - хранилище компонентов салата, которые являются овощами и их параметров.
 *
 * @author Павел Панкратов
 * @version 1.0
 */

public enum Vegetables implements SaladComponent {

    TOMATO(50, 3),
    CUCUMBER(20, 2),
    ONION(80, 1),
    BELL_PEPPER(60, 1),
    LETTUCE(5, 10);

    /**
     * Поле значение калорийности на единицу продукта
     */
    private int caloriesPerUnit;
    /**
     * Поле количество овощей в салате
     */
    private int amount;

    /**
     * Конструктор - инициализация полей компонентов
     *
     * @param caloriesPerUnit - значение поля калорийности
     * @param amount          - значение поля количества
     **/
    Vegetables(int caloriesPerUnit, int amount) {
        this.caloriesPerUnit = caloriesPerUnit;
        this.amount = amount;
    }

    /**
     * Метод подсчета калорийности компонента
     *
     * @return возвращает значение калорийности
     */
    @Override
    public final float calcCalories() {
        return amount * caloriesPerUnit;
    }

    /**
     * Метод получения имени компонента
     *
     * @return возвращает имя
     */
    @Override
    public final String getName() {
        return this.name();
    }

}
