package lesson_4;

import java.util.Arrays;

public class homework7x02 {
    public static void main(String[] args) {
        System.out.println("Первая задачка:");
        int sumEven = 0;
        int[] array = {34, 35, 36, 37, 38, 39, 40, 50, 60, 70, 333};

        //1) Сколько в массиве четных чисел?
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven++;
            }
        }
        System.out.println(sumEven);
        System.out.println("Вторая задачка:");


        //2)Все числа из массива, которые больше 10, но меньше 25.
        int minimum = 10;
        int maximum = 25;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= minimum) && (array[i] <= maximum)) {
                System.out.println(array[i]);
            }

        }
        //3)Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трём.
        System.out.println("Третья задачка:");
        for (int i = array.length - 1; i > 0; i--) { // тут возникла сложность никак не мог решить. посмотрел повтор урока, там написали -1 и всё заработало. Можно вкратце объяснить зачем мы поставили -1?
            System.out.println(array[i]);
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println();

        //По желанию. Вывести только те числа, которые содержат в себе символ 4.

        for (int i = 0; i < array.length - 1; i++) {
            String s = "" + array[i];
            char[] charaaray = s.toCharArray();

            for (int j = 0; j < charaaray.length; j++) {
                if (charaaray[j] == '4') {
                    System.out.println(s);
                    break;
                }
            }

        }
    }
}




