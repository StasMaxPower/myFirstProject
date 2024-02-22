package lesson_9.task2;

import lesson_9.task1.Oval;

public class Main {

    public static void main(String[] args) {
        Object object = new Object();
        Oval oval = new Oval(3, 4);
        Oval oval1 = new Oval(5, 4);

        object = 40;
        System.out.println(object);

        object = "Привет";
        System.out.println(object);

        object = oval;
        System.out.println(object);

        Integer[] arrayInt = {1, 2, 4, 5};
        String[] arrayStrring = {"Hello", "Hello world"};
        Oval[] arrayOval = {oval, oval};

        System.out.println();
        System.out.println(sizeOfArray(arrayInt));
        System.out.println(sizeOfArray(arrayOval));
        System.out.println(sizeOfArray(arrayStrring));
    }

    static int sizeOfArray(Object[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

}
