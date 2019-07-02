package com.company.view;

import com.company.controller.ResourceController;
import com.company.model.SaladComponent;
import java.util.List;

/**
 * Класс вьювер для выведения информации на экран.
 *
 * @author Павел Панкратов
 * @version 1.0
 */

public class Viewer {
    /**
     * Поле значение бандла
     */
    private ResourceController uiManager;
    /**
     * Поля строковых констант
     */
    private final String COMPONENTS = "components";
    public final String PROGRAM_STARTED = "menu.start";
    private final String EMPTY = "empty";
    public final String SALAD_CALORIES = "salad.calories";
    public final String SALAD_SORTED = "salad.sorted";
    public final String INPUT_CALORIES = "input.calories";
    public final String WRONG_INPUT = "wrong.input";
    public final String MENU = "menu";
    public final String MENU_LANGUAGE = "menu.language";
    public final String PROGRAM_CLOSED = "menu.close";

    /**
     * Конструткор задает значения бандла
     */
    public Viewer() {
        this.uiManager = ResourceController.USER_INTERFACE;
    }

    /**
     * Метод получения бандла
     *
     * @return возвращает бандл
     */
    public final ResourceController getUIManager() {
        return this.uiManager;
    }

    /**
     * Метод вывода сообщения на экран
     *
     * @param mes - сообщение
     */
    public final void printMessage(String mes) {
        System.out.println(mes);
    }

    /**
     * Метод вывода списка компонентов на экран
     *
     * @param components - список компонентов
     */
    public final void printComponents(List<SaladComponent> components) {
        System.out.print(uiManager.getString(COMPONENTS) + " ");

        for (int i = 0; i < components.size() - 1; i++) {
            System.out.print(components.get(i).getName() + ", ");
        }
        if (components.size() > 0) {
            System.out.println(components.get(components.size() - 1) + ".\n");
        } else {
            printMessage(uiManager.getString(EMPTY));
        }
    }
}