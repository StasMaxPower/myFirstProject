package lesson_4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //пользователь вводит пароть. Пароль должен обязательно содержать хотя одну цифру

        System.out.println("Введите пароль");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] symbols = input.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if ((symbols[i] == '1') || (symbols[i] == '2')) {
                System.out.println("Пароль содержит цифру");
                break;
            }
            else {
                System.out.println("Пароль не содержит цифру");
            }
        }
    }
}
