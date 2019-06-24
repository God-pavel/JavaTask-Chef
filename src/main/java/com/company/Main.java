package com.company;
import com.company.controller.InputController;
import com.company.controller.MainController;
import com.company.model.Salad;
import com.company.view.Viewer;

public class Main {

    public static void main(String[] args) {
        MainController controller = new MainController(new Salad(), new Viewer(), new InputController());
        controller.startMenu();
    }
}
