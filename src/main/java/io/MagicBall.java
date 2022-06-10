package io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String res = sc.nextLine();
        if (answer == 0) {
            System.out.println("Да");
    } else if (answer == 1) {
            System.out.println("Нет");
        } else if (answer == 2) {
            System.out.println("Может быть");
        }
}
}