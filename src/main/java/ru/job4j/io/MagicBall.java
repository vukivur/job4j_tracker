package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Вас приветствует Оракул. Задайте закрытый вопрос:");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println(question + " - Да.");
                break;
            case 1:
                System.out.println(question + " - Нет.");
                break;
            default:
                System.out.println(question + " - Может быть.");
        }
    }
}
