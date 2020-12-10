package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int count = 0;
        System.out.println("Игра Спички. Игроки вытягивают по очереди спички.");
        System.out.println("За раз можно вытянуть 1 - 3 спички.");
        System.out.println("Выигрывает игрок, который вытягивает последние спички.");
        System.out.println("Первым ходит Игрок 1\n");
        while (matches > 0) {
            System.out.print("Спичек осталось: " + matches + ". Выберите количество спичек: ");
            int guess = Integer.valueOf(input.nextLine());
            if (guess > 3 || guess < 1) {
                System.out.println("Неправильное число. Введите число еще раз.");
            } else {
                matches -= guess;
                count++;
            }
        }
        if (count % 2 != 0) {
            System.out.println("Игра закончилась. Выиграл Игрок 1.");
        } else {
            System.out.println("Игра закончилась. Выиграл Игрок 2.");
        }
    }
}
