package com.company.controller;
import java.util.Scanner;

public class InputController {

    private Scanner scanner;

    public InputController() {
        scanner = new Scanner(System.in);
    }

    public String readLine() {
        return scanner.nextLine();
    }
    public int readInt() {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }
}
