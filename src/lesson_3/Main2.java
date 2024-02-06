package lesson_3;

public class Main2 {

    public static void main(String[] args) {
/*
        int[] array = new int[10];
        String[] arrayString = new String[10];

        int[] a = {1, 2, 3, 4, 5, 6, 7};

        a[1] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();
        System.out.println(a.length);
*/


        //создть массив длиной 10 и наполнить его чиcлами 50 55 60 65 ...

        int[] array10 = new int[10];
        for (int i = 0; i < array10.length; i++) {
            array10[i] = 50 + i * 5;
        }

        for (int i = 0; i < array10.length; i++) {
            System.out.println(array10[i]);
        }

        //создать массив и вывести на консоль среднее значение элементов массива

        int sum = 0;
        for (int i = 0; i < array10.length; i++) {
            sum = sum + array10[i];
        }
        System.out.println((double)sum/array10.length);

    }


}
