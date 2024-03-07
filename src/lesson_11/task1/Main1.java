package lesson_11.task1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавляем элементы в ArrayList");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("Результат работы по добавлению в конец ArrayList " + (end - start));

        System.out.println("Добавляем элементы в LinkedList");
         start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(10);
        }
         end = System.currentTimeMillis();
        System.out.println("Результат работы по добавлению в конец LinkedList " + (end - start));


        System.out.println("Добавляем элементы в начало ArrayList");
         start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0,10);
        }
         end = System.currentTimeMillis();
        System.out.println("Результат работы по добавлению в начало ArrayList " + (end - start));

        System.out.println("Добавляем элементы в начало LinkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0,10);
        }
        end = System.currentTimeMillis();
        System.out.println("Результат работы по добавлению в начало LinkedList " + (end - start));



        System.out.println("Получаем элементы из ArrayList");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(25000);
        }
        end = System.currentTimeMillis();
        System.out.println("Результат работы по получению элемента из ArrayList " + (end - start));

        System.out.println("Добавляем элементы в начало LinkedList");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.get(25000);
        }
        end = System.currentTimeMillis();
        System.out.println("Результат работы по получению элемента из LinkedList " + (end - start));

        //ArrayList - 1.при добавлении элементов в конец
        //               2. Получения элмента по индексу

       // LinkedList - 1. при добавлении удалении элемента в начало в середину списка

    }

}
