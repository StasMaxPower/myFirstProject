package lesson_5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        String[] word = {"Яблоко", "Банан", "Груша"};

/*        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }*/

/*        for (String s : word) {
            System.out.println(s);
        }*/

/*        int a = 10;

        while (a < 10) {
            System.out.println("Привет");
            a++;
        }*/

/*        do {
            System.out.println("Привет");
            a++;
        } while (a < 10);*/


        String pas = "qwe";

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите пароль");
            input = scanner.nextLine();
        } while (!input.equals(pas));

        System.out.println("Успешный вход");

    }
}
