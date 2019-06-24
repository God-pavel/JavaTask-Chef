package com.company.controller;
import java.util.Scanner;
/**
 * Класс для получения значений из комндной строки.
 * @autor Павел Панкратов
 * @version 1.0
 */

public class InputController {

    /** Поле сканнер  */
    private Scanner scanner;

    /** Конструктор - создание нового сканера  */
    public InputController() {
        scanner = new Scanner(System.in);
    }

    /**
     * Метод получения значения строки
     * @return возвращает строку
     */
    public String readLine() {
        return scanner.nextLine();
    }
    /**
     * Метод получения числового значения
     * @return возвращает введеное число
     */
    public int readInt() {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);
        return number;
    }
}
