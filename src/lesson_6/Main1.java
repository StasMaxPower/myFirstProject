package lesson_6;

public class Main1 {

    public static void main(String[] args) {

        final int a;
        a = 11;



        String message = "Привет";




        String message1 = "Привет";
        // message.getBytes();
        final House house = new House();
        House house1 = new House();

        house.windowCount = 10;

        House.wallCount = 6;
        System.out.println(house.wallCount);
        System.out.println(house1.wallCount);

        house.windowCount = 10;

        house.build();

        House.getInfo();


        System.out.println();

        //есть адрес электроной почты, необходимо провалидировать на корректность и
        // выдать пользователю соответствующее сообщение

        String email = "#test@mail.ru";
        if (!email.contains("@")) {
            System.out.println("Данный адрес некорректен");
            return;
        }

        // char[] chars = email.toCharArray();
        String[] split = email.split("@");
        if (split.length != 2) {
            System.out.println("Данный адрес некорректен");
        }

        if (email.startsWith("#") || email.startsWith("!")) {
            System.out.println("Данный адрес некорректен");
            return;
        }


        System.out.println("Адрес корректен");



    }


}
