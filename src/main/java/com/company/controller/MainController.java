package com.company.controller;

import com.company.model.Salad;
import com.company.view.Viewer;

import java.util.Locale;

/**
 * Класс-контролер регулирующий ход выполнения программы
 *
 * @author Павел Панкратов
 * @version 1.0
 */

public class MainController {

    /**
     * Поле салат
     */
    private Salad salad;
    /**
     * Поле вьювер

     */
    private Viewer viewer;
    /**
     * Поле контроллер ввода
     */
    private InputController inputController;

    /**
     * Конструктор - создание объекта и инициализация полей
     *
     * @param salad  - ссылка на объект салат
     * @param viewer - ссылка на вьювер
     * @param salad  - ссылка на контролер ввода
     */
    public MainController(Salad salad, Viewer viewer, InputController inputController) {
        this.salad = salad;
        this.viewer = viewer;
        this.inputController = inputController;

    }

    /**
     * Метод вызова меню для выбора языка
     */
    private void chooseLanguage() {
        boolean onMenu = true;
        while (onMenu) {
            viewer.printMessage(viewer.getUIManager().getString(viewer.MENU_LANGUAGE));
            String menuNum = inputController.readLine();
            Locale locale;
            switch (menuNum) {
                case "1":
                    locale = new Locale("en", "US");
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                case "2":
                    locale = new Locale("uk", "UA");
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                case "3":
                    locale = new Locale("ru", "RU");
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                default:
                    viewer.printMessage(viewer.getUIManager().getString(viewer.WRONG_INPUT));
            }
        }
    }

    /**
     * Метод получения значений границ и нахождения объектов по ним
     */
    private void getBorders() {
        int lowBorder;
        int upperBorder;
        do {
            viewer.printMessage(viewer.getUIManager().getString(viewer.INPUT_CALORIES));
            lowBorder = inputController.readInt();
            upperBorder = inputController.readInt();
        } while (lowBorder >= upperBorder);
        viewer.printComponents(salad.findByCalorie(lowBorder, upperBorder));
    }

    /**
     * Метод - ход исполения программы
     */
    public void startMenu() {
        viewer.printMessage(viewer.getUIManager().getString(viewer.PROGRAM_STARTED));
        viewer.printComponents(salad.getComponents());

        boolean onMenu = true;
        while (onMenu) {
            viewer.printMessage(viewer.getUIManager().getString(viewer.MENU));
            String menuNum = inputController.readLine();
            switch (menuNum) {
                case "1":
                    viewer.printMessage(viewer.getUIManager().getString(viewer.SALAD_CALORIES) + " " + salad.calculateSaladCalories() + ".\n");
                    break;
                case "2":
                    salad.sortByCalorie();
                    viewer.printMessage(viewer.getUIManager().getString(viewer.SALAD_SORTED));
                    viewer.printComponents(salad.getComponents());
                    break;
                case "3":
                    getBorders();
                    break;
                case "4":
                    chooseLanguage();
                    break;
                case "5":
                    viewer.printMessage(viewer.getUIManager().getString(viewer.PROGRAM_CLOSED));
                    onMenu = false;
                    break;
                default:
                    viewer.printMessage(viewer.getUIManager().getString(viewer.WRONG_INPUT));
                    break;
            }

        }
    }
}
