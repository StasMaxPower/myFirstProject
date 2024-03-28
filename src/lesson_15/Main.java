package lesson_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();

        if (login.length() > 0) {
            checkLogin(login);
        } else {
            checkLogin(null);
        }
    }

    public static void checkLogin(String login) {
        if (login == null){
            System.out.println("Ошибка");
            return;
        }
        if ("admin".equals(login)) {
            System.out.println("Привет, админ");
        } else {
            System.out.println("Привет гость");
        }
    }

    // 1. Создается объект класса- наследника RuntimeException
    // 2. У этого обьекта вызывается метод printStacktrace()
    // 3. System.exit - принудительно завершает раблоту программы

}
