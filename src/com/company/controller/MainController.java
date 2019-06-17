package com.company.controller;

import com.company.model.Salad;
import com.company.view.Viewer;
import java.util.Locale;

public class MainController {
    private Salad salad;
    private Viewer viewer;
    private InputController inputController;


    public MainController(Salad salad, Viewer viewer, InputController inputController){
        this.salad = salad;
        this.viewer = viewer;
        this.inputController = inputController;

    }

    private void chooseLanguage(){
        boolean onMenu = true;
        do {
            viewer.printMessage(viewer.getUIManager().getString(viewer.MENU_LANGUAGE));
            String menuNum = inputController.readLine();
            Locale locale;
            switch (menuNum){
                case "1":
                    locale = Locale.getDefault();
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                case "2":
                    locale = new Locale("uk","UA");
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                case "3":
                    locale = new Locale("ru","RU");
                    viewer.getUIManager().changeResource(locale);
                    onMenu = false;
                    break;
                default:
                    viewer.printMessage(viewer.getUIManager().getString(viewer.WRONG_INPUT));
            }
        } while (onMenu);
    }

    private void getBorders(){
        int lowBorder;
        int upperBorder;
        do {
            viewer.printMessage(viewer.getUIManager().getString(viewer.INPUT_CALORIES));
            lowBorder = inputController.readInt();
            upperBorder = inputController.readInt();
        } while (lowBorder >= upperBorder);
        viewer.printComponents(salad.findByCalorie(lowBorder,upperBorder));
    }

    public void startMenu(){
        viewer.printMessage(viewer.getUIManager().getString(viewer.PROGRAM_STARTED));
        chooseLanguage();

        viewer.printComponents(salad.getComponents());

        boolean onMenu = true;
        do{
            viewer.printMessage(viewer.getUIManager().getString(viewer.MENU));
            String menuNum = inputController.readLine();
            switch (menuNum){
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
                    viewer.printMessage(viewer.getUIManager().getString(viewer.PROGRAM_CLOSED));
                    onMenu = false;
                    break;
                default:
                    viewer.printMessage(viewer.getUIManager().getString(viewer.WRONG_INPUT));
                    break;
            }

        } while (onMenu);
    }
}
