package com.company.model;

/**
 * Enum - хранилище компонентов салата, которые не являются овощами и их параметров.
 *
 * @author Павел Панкратов
 * @version 1.0
 */

public enum OtherComponents implements SaladComponent {

    FETA(264, 200),
    OLIVE_OIL(864, 50),
    LEMON_JUICE(22, 30);

    /**
     * Поле значение калорийности на 100 грамм продукта
     */
    private int caloriesPerHundredGrams;
    /**
     * Поле масса комонента в салате
     */
    private int mass;

    /**
     * Конструктор - инициализация полей компонентов
     *
     * @param caloriesPerHundredGrams - значение поля калорийности
     * @param mass                    - значение поля массы
     **/
    OtherComponents(int caloriesPerHundredGrams, int mass) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.mass = mass;
    }

    /**
     * Метод подсчета калорийности компонента
     *
     * @return возвращает значение калорийности
     */
    @Override
    public final float calcCalories() {
        return (float) (mass * caloriesPerHundredGrams) / 100;
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
